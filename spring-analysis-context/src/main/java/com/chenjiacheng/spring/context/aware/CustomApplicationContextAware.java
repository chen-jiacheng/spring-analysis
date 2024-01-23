package com.chenjiacheng.spring.context.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by chenjiacheng on 2024/1/16 00:16
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomApplicationContextAware implements ApplicationContextAware {

    private ApplicationContext ctx;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }
}
