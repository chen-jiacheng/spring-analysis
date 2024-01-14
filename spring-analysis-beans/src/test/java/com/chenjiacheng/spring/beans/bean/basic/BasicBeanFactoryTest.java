package com.chenjiacheng.spring.beans.bean.basic;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenjiacheng on 2024/1/7 15:21
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@SuppressWarnings("ALL")
public class BasicBeanFactoryTest {

    private static final String config = "bean/spring-beans-basic.xml";

    private BeanFactory beanFactory;

    @Before
    public void init() {
        this.beanFactory = new XmlBeanFactory(new ClassPathResource(config));
        Assert.assertNotNull(beanFactory);
    }

    @Test
    public void getSimpleBeanTest() {
        SimpleBean simpleBean = (SimpleBean)beanFactory.getBean("simpleBean");
        Assert.assertNotNull(simpleBean);
        simpleBean.sayHi();
    }

    @Test
    public void getPropertiesBeanTest() {
        PropertiesBean propertiesBean = (PropertiesBean)beanFactory.getBean("propertiesBean");
        System.out.println("propertiesBean = " + propertiesBean);
        Assert.assertNotNull(propertiesBean);
    }

    //constructorBean
    @Test
    public void getconstructorBeanTest() {
        PropertiesBean constructorBean = (PropertiesBean)beanFactory.getBean("constructorBean");
        System.out.println("constructorBean = " + constructorBean);
        Assert.assertNotNull(constructorBean);
    }
}
