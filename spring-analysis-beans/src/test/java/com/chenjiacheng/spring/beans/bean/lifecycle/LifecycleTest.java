package com.chenjiacheng.spring.beans.bean.lifecycle;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/15 01:13
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class LifecycleTest {

    @Test
    public void lifecycleTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean/spring-beans-lifecycle.xml");
        Hello hello = (Hello) ctx.getBean("hello");
        hello.say();
    }

}
