package com.chenjiacheng.spring.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.util.Enumeration;

/**
 * Created by chenjiacheng on 2024/1/23 23:03
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringAnalysisJdbcApplication {
    public static void main(String[] args) {
        Enumeration<Driver> drivers = DriverManager.getDrivers();
        System.out.println("drivers = " + drivers);

        while (drivers.hasMoreElements()) {
            Driver driver = drivers.nextElement();
            System.out.println("driver: "+driver.getClass().getName());
        }

    }
}