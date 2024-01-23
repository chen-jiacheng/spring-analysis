package com.chenjiacheng.spring.aop;

import com.chenjiacheng.spring.aop.aop.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenjiacheng on 2023/12/12 23:02
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringAnalysisAopApplication {

    public static void main(String[] args) {
        String path = "spring-aop.xml";
        ApplicationContext ctx = new ClassPathXmlApplicationContext(path);
        TestBean bean = (TestBean)ctx.getBean("test");
        bean.test();
    }






}