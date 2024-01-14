package com.chenjiacheng.spring.beans.imports;

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
public class ImportBeanFactoryTest {

    private BeanFactory beanFactory;

    @Before
    public void init(){
        this.beanFactory = BeanFactoryUtil.ofPath("imports/spring-beans.xml");
    }

    @Test
    public void importTagBeanTest(){
        ExternalBean externalBean = (ExternalBean) beanFactory.getBean("externalBean");
        System.out.println("externalBean = " + externalBean);

        Assert.assertNotNull(externalBean);
    }

}
