package com.chenjiacheng.spring.context.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.env.Environment;

/**
 * Created by chenjiacheng on 2024/1/16 00:17
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomEnvironmentAware implements BeanFactoryPostProcessor,EnvironmentAware {

    private Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        System.out.println("CustomEnvironmentAware.setEnvironment");
        this.environment = environment;
    }

    // @Override
    // public int getOrder() {
    //     return 0;
    // }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("CustomEnvironmentAware.postProcessBeanFactory");

    }
}
