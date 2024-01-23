package com.chenjiacheng.spring.context.event;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/22 23:28
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class TestEventTest {
    private static final String location = "spring-context.xml";

    @Test
    public void eventTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(location);
        TestEvent event = new TestEvent("hello", "msg");
        ctx.publishEvent(event);


    }

}
