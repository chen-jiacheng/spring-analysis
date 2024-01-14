package com.chenjiacheng.spring.beans.bean.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by chenjiacheng on 2024/1/15 00:53
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

    public ApplicationContext getApplicationContext() {
        return ctx;
    }

}
