package com.chenjiacheng.spring.jdbc.java;

import com.google.common.base.CaseFormat;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.*;
import java.util.*;

/**
 * Created by chenjiacheng on 2024/1/26 00:40
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SqlExecutor {
    private static String url;
    private static String username;
    private static String password;
    private static String driver;

    static {
        try {
            Properties datasource = new Properties();
            datasource.load(ClassLoader.getSystemResourceAsStream("datasource.properties"));
            driver = datasource.getProperty("jdbc.driver");
            url = datasource.getProperty("jdbc.url");
            username = datasource.getProperty("jdbc.username");
            password = datasource.getProperty("jdbc.password");

            Class.forName(driver);
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }

    public static <T> List<T> select(String sql, Class<T> clazz, Object... params) throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Connection connection = getConnection();

        PreparedStatement statement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                statement.setObject(i + 1, param);
            }
        }

        ResultSet rs = statement.executeQuery();
        List<T> results = resolveResult(clazz, rs);

        rs.close();
        statement.close();
        connection.close();

        return results;
    }

    private static <T> List<T> resolveResult(Class<T> clazz, ResultSet result) throws SQLException, InstantiationException, IllegalAccessException {
        // 映射: result -> map -> object
        // 1. 映射: [下划线命名 => 驼峰命名]
        Map<String, String> propertyMapping = new HashMap<>();

        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            String fieldName = CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, columnName);
            propertyMapping.put(columnName, fieldName);
        }

        // 2. 映射: [驼峰命名 => 字段值]
        List<Map<String, Object>> resultMappings = new ArrayList<>();
        while (result.next()) {
            Map<String, Object> resultMapping = new HashMap<>();
            for (Map.Entry<String, String> entry : propertyMapping.entrySet()) {
                String jdbcFieldName = entry.getKey();
                String javaFieldName = entry.getValue();
                Object object = result.getObject(jdbcFieldName);
                resultMapping.put(javaFieldName, object);
            }
            resultMappings.add(resultMapping);
        }

        if (resultMappings.isEmpty()) {
            return Collections.emptyList();
        }

        List<T> results = new ArrayList<>();
        for (Map<String, Object> resultMapping : resultMappings) {
            T instance = clazz.newInstance();
            for (Map.Entry<String, Object> entry : resultMapping.entrySet()) {
                String fieldName = entry.getKey();
                Object fieldValue = entry.getValue();
                try {
                    Field field = clazz.getDeclaredField(fieldName);
                    boolean accessible = field.isAccessible();
                    field.setAccessible(true);
                    field.set(instance, fieldValue);
                    field.setAccessible(accessible);
                } catch (NoSuchFieldException e) {
                    System.out.println("e = " + e);
                }
            }
            results.add(instance);
        }
        return results;
    }

    public static int insert(String sql, Object... params) throws SQLException {
        return executeUpdate(sql, params);
    }

    public static int update(String sql, Object... params) throws SQLException {
        return executeUpdate(sql, params);
    }

    public static int delete(String sql, Object... params) throws SQLException {
        return executeUpdate(sql, params);
    }


    private static int executeUpdate(String sql, Object... params) throws SQLException {
        Connection connection = getConnection();

        PreparedStatement statement = connection.prepareStatement(sql);
        if (params != null && params.length > 0) {
            for (int i = 0, j = 1; i < params.length; i++, j++) {
                Object param = params[i];
                statement.setObject(j, param);
            }
        }
        int changes = statement.executeUpdate();

        statement.close();
        connection.close();
        return changes;
    }

    public static void main(String[] args) throws SQLException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        List<User> result = SqlExecutor.select("select * from USER;", User.class);
        System.out.println("result = " + result);
    }


}
