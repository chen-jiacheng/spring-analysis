package com.chenjiacheng.spring.context.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by chenjiacheng on 2024/1/22 23:26
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class TestListener implements ApplicationListener<TestEvent> {
    @Override
    public void onApplicationEvent(TestEvent event) {
        System.out.println("TestListener.onApplicationEvent");
        event.print();
    }
}
