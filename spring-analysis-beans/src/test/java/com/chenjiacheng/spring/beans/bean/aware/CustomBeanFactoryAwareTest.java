package com.chenjiacheng.spring.beans.bean.aware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/15 00:56
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomBeanFactoryAwareTest {


    @Test
    public void awareTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/spring-beans-aware.xml");
        CustomBeanFactoryAware aware = (CustomBeanFactoryAware) ctx.getBean("customBeanFactoryAware");
        Hello hello = (Hello) aware.getBeanFactory().getBean("hello");
        hello.say();
    }
}
