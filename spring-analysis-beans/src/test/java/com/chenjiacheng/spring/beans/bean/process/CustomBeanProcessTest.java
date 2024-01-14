package com.chenjiacheng.spring.beans.bean.process;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/15 00:56
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomBeanProcessTest {

    @Test
    public void processTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/spring-beans-process.xml");
        // CustomBeanPostProcessor process = (CustomBeanPostProcessor) ctx.getBean("process");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.say();
    }
}
