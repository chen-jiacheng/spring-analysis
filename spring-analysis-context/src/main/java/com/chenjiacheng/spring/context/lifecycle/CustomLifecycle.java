package com.chenjiacheng.spring.context.lifecycle;

import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;

/**
 * Created by chenjiacheng on 2024/1/22 23:35
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomLifecycle implements SmartLifecycle {

    private boolean isRunning;

    @Override
    public void start() {
        System.out.println("CustomLifecycle.start");
        isRunning = true;
    }

    @Override
    public void stop() {
        System.out.println("CustomLifecycle.stop");
        isRunning = false;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
