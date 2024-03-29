package com.chenjiacheng.spring.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by chenjiacheng on 2023/12/12 23:02
 *
 * @author chenjiacheng
 * @since 1.0.0
 */

public class SpringAnalysisContextApplication {

    private static final String location = "spring-context.xml";

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(location);
        System.out.println("ctx = " + ctx);




    }
}