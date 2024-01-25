package com.chenjiacheng.spring.jdbc.java;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by chenjiacheng on 2024/1/24 23:36
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class JavaJdbcApplication {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {

        Properties datasource = new Properties();
        datasource.load(ClassLoader.getSystemClassLoader()
                .getResourceAsStream("datasource.properties"));
        String driver = datasource.getProperty("datasource.driver");
        String url = datasource.getProperty("datasource.url");
        String user = datasource.getProperty("datasource.user");
        String password = datasource.getProperty("datasource.password");

        System.out.println(driver+" - "+ url + " - " + user + " - " + password);


        // 驱动，连接，语句，结果集
        // 流程: 类加载=>执行静态方法，调用DriverManager注册驱动
        Class.forName(driver);
        // 流程：调用mysql实现类进行连接
        Connection connection = DriverManager.getConnection(
                url, user, password);

        // 数据库连接池，管理数据连接

        connection.setAutoCommit(false);
        connection.commit();
        connection.rollback();

        // //1. 普通sql语句
        // Statement statement = connection.createStatement();
        // ResultSet resultSet = statement.executeQuery("select * from user");
        //
        //
        //
        // resultSet.close();
        // statement.close();
        //
        // //2. 占位符解析语句
        // PreparedStatement preparedStatement = connection.prepareStatement(
        //         "select * from user where name = ? and age = ?;"
        // );
        // preparedStatement.setString(1,"chenjiacheng");
        // preparedStatement.setInt(2,24);
        // ResultSet resultSet1 = preparedStatement.executeQuery();
        //
        // resultSet1.close();
        // preparedStatement.close();

        connection.close();


    }
}
