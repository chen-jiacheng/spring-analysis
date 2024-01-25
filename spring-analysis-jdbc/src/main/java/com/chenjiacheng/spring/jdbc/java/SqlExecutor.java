package com.chenjiacheng.spring.jdbc.java;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

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
        return DriverManager.getConnection(url,username,password);
    }

    public static <T> T selectOne(String sql,Class<T> clazz,Object...params) throws SQLException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Connection connection = getConnection();

        PreparedStatement statement = connection.prepareStatement(sql);
        if(params!=null&&params.length>0){
            for (int i = 0; i < params.length; i++) {
                Object param = params[i];
                statement.setObject(i+1,param);
            }
        }

        ResultSet rs = statement.executeQuery();

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = metaData.getColumnName(i);
            System.out.print(columnName+"\t\t");
        }
        System.out.println();
        T result = clazz.newInstance();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(rs.getObject(i)+"\t");
                clazz.getField("").set(result,"");
            }
            System.out.println();
        }
        rs.close();
        statement.close();
        connection.close();

        return result;
    }
    public static int insert(String sql,Object...params){
        return 0;
    }
    public static int update(String sql,Object...params){
        return 0;
    }
    public static int delete(String sql,Object...params){
        return 0;
    }

    public static Object executor(String sql, Object...params) throws SQLException {
        return null;
    }

    public static void main(String[] args) throws SQLException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Object result = SqlExecutor.selectOne("select * from USER where username = ?;", Object.class,"Charlie Smith");
        System.out.println("result = " + result);
    }


}
