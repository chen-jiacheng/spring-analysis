package com.chenjiacheng.spring.beans;

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
public class SpringAnalysisBeansApplication {

    public static void main(String[] args) {
        SpringAnalysisBeansApplication application = new SpringAnalysisBeansApplication();

        String path = "spring-beans.xml";
        BeanFactory factory = application.loadBeanFactory(path);

        String configLocation = "spring-beans.xml";
        ApplicationContext ctx = application.loadApplicationContext(configLocation);
    }

    /***
     * 加载bean工厂
     * @param path 配置文件路径
     * @return bean工厂
     */
    @SuppressWarnings("deprecation")
    public BeanFactory loadBeanFactory(String path){
        return new XmlBeanFactory(new ClassPathResource(path));
    }

    /***
     * 加载应用上下文
     * @param configLocation 配置文件路径
     * @return 应用上下文
     */
    public ApplicationContext loadApplicationContext(String configLocation){
        return new ClassPathXmlApplicationContext(configLocation);
    }




}