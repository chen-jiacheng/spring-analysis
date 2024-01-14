package com.chenjiacheng.spring.beans.beans;

import com.chenjiacheng.spring.beans.util.BeanFactoryUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by chenjiacheng on 2024/1/7 15:30
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class BeansBeanFactoryTest {

    private BeanFactory beanFactory;

    @Before
    public void init(){
        this.beanFactory = BeanFactoryUtil.ofPath("beans/spring-beans.xml");
    }

    @Test
    public void beansTagBeanTest(){
        InnerBean innerBean = (InnerBean) beanFactory.getBean("innerBean");
        System.out.println("innerBean = " + innerBean);

        Assert.assertNotNull(innerBean);
    }

}
