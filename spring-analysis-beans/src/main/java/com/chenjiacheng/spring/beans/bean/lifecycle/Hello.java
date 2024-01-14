package com.chenjiacheng.spring.beans.bean.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.Lifecycle;

/**
 * Created by chenjiacheng on 2024/1/15 01:07
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class Hello implements InitializingBean, DisposableBean, Lifecycle {

    public void say(){
        System.out.println("Hello.say");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Hello.afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Hello.destroy");
    }

    @Override
    public void start() {
        System.out.println("Hello.start");
    }

    @Override
    public void stop() {
        System.out.println("Hello.stop");
    }

    @Override
    public boolean isRunning() {
        System.out.println("Hello.isRunning");
        return false;
    }
}
