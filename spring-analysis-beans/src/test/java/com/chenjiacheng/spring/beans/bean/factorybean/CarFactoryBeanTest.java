package com.chenjiacheng.spring.beans.bean.factorybean;

import com.chenjiacheng.spring.beans.util.BeanFactoryUtil;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by chenjiacheng on 2024/1/15 00:42
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CarFactoryBeanTest {

    @Test
    public void factoryBeanTest() throws Exception {
        BeanFactory factory = BeanFactoryUtil.ofPath("bean/spring-beans-basic-factory-bean.xml");
        CarFactoryBean factoryBean =(CarFactoryBean) factory.getBean("&car");
        System.out.println("factoryBean = " + factoryBean);
        Car car = factoryBean.getObject();
        System.out.println("car = " + car);
    }

    @Test
    public void factoryBeanGetBeanTest() throws Exception {
        BeanFactory factory = BeanFactoryUtil.ofPath("bean/spring-beans-basic-factory-bean.xml");
        Car car =(Car) factory.getBean("car");
        System.out.println("car = " + car);
    }

}
