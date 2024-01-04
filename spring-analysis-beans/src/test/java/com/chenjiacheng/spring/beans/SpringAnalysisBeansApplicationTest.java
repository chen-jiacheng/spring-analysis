package com.chenjiacheng.spring.beans;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;


/**
 * Created by chenjiacheng on 2023/12/12 23:40
 * 配置文件查找顺序: 先test，再正常代码。
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringAnalysisBeansApplicationTest {

    @Test
    public void loadBeanFactory(){
        SpringAnalysisBeansApplication application = new SpringAnalysisBeansApplication();

        String path = "spring-beans.xml";
        BeanFactory factory = application.loadBeanFactory(path);
        Assert.assertNotNull(factory);
    }

    @Test
    public void loadApplicationContext(){
        SpringAnalysisBeansApplication application = new SpringAnalysisBeansApplication();

        String configLocation = "spring-beans.xml";
        ApplicationContext ctx = application.loadApplicationContext(configLocation);
        Assert.assertNotNull(ctx);
    }



}