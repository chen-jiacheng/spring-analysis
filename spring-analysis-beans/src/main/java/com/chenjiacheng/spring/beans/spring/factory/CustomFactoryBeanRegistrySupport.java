package com.chenjiacheng.spring.beans.spring.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.support.FactoryBeanRegistrySupport;

/**
 * Created by chenjiacheng on 2023/12/17 19:49
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomFactoryBeanRegistrySupport extends FactoryBeanRegistrySupport {
    @Override
    protected Class<?> getTypeForFactoryBean(FactoryBean<?> factoryBean) {
        return super.getTypeForFactoryBean(factoryBean);
    }
}
