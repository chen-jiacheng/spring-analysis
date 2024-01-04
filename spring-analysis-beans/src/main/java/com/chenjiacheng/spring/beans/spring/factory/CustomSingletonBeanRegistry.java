package com.chenjiacheng.spring.beans.spring.factory;

import org.springframework.beans.factory.config.SingletonBeanRegistry;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;

/**
 * 注册&获取bean
 *
 * Created by chenjiacheng on 2023/12/17 19:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomSingletonBeanRegistry implements SingletonBeanRegistry {
    @Override
    public void registerSingleton(String beanName, Object singletonObject) {

    }

    @Override
    public Object getSingleton(String beanName) {
        return null;
    }

    @Override
    public boolean containsSingleton(String beanName) {
        return false;
    }

    @Override
    public String[] getSingletonNames() {
        return new String[0];
    }

    @Override
    public int getSingletonCount() {
        return 0;
    }

    @Override
    public final Object getSingletonMutex() {
        return null;
    }

    public static void main(String[] args) {
        DefaultSingletonBeanRegistry defaultSingletonBeanRegistry = new DefaultSingletonBeanRegistry();

    }

}
