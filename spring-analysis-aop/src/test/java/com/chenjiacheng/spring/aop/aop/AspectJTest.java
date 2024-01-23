package com.chenjiacheng.spring.aop.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2024/1/23 22:24
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class AspectJTest {

    @Test
    public void aspectTest(){
        String path = "spring-aop.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        TestBean bean = (TestBean)ctx.getBean("test");
        bean.test();

        // AopNamespaceHandler init
        // AspectJAutoProxyBeanDefinitionParser

    }

}
