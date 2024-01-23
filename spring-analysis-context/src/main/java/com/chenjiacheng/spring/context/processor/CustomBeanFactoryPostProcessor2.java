package com.chenjiacheng.spring.context.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

/**
 * Created by chenjiacheng on 2024/1/18 00:46
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomBeanFactoryPostProcessor2 implements BeanFactoryPostProcessor, Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("CustomBeanFactoryPostProcessor2.postProcessBeanFactory");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
