package com.chenjiacheng.spring.context.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/**
 * Created by chenjiacheng on 2024/1/22 23:25
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class TestEvent extends ApplicationEvent {

    String msg;

    public TestEvent(Object source) {
        super(source);
    }

    public TestEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public void print(){
        System.out.println("TestEvent.print");
        System.out.println("msg: "+msg);
    }

}
