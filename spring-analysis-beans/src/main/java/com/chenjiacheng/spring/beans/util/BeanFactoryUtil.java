package com.chenjiacheng.spring.beans.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by chenjiacheng on 2024/1/7 15:36
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@SuppressWarnings("ALL")
public class BeanFactoryUtil {

    public static BeanFactory ofPath(String path){
        return new XmlBeanFactory(new ClassPathResource(path));
    }

}
