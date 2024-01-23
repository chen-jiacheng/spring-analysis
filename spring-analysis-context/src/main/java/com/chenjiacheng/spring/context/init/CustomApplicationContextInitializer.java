package com.chenjiacheng.spring.context.init;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/22 23:19
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {

    private ConfigurableApplicationContext ctx;

    @Override
    public void initialize(ConfigurableApplicationContext ctx) {
        System.out.println("CustomApplicationContextInitializer.initialize");
        System.out.println("ctx = " + ctx);
        this.ctx = ctx;
    }
}
