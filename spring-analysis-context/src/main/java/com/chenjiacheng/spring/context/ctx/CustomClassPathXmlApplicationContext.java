package com.chenjiacheng.spring.context.ctx;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.StandardEnvironment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenjiacheng on 2024/1/17 00:21
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
    private static final String location = "spring-context.xml";

    public CustomClassPathXmlApplicationContext(String... configLocations) throws BeansException {
        super(configLocations);
    }

    @Override
    protected void initPropertySources() {
        ConfigurableEnvironment environment = new StandardEnvironment();
        MutablePropertySources propertySources = environment.getPropertySources();
        Map<String, Object> myMap = new HashMap<>();
        myMap.put("env", "prod");
        propertySources.addFirst(new MapPropertySource("MY_MAP", myMap));

        getEnvironment().merge(environment);

        getEnvironment().setRequiredProperties("env");
    }

    public static void main(String[] args) {
        CustomClassPathXmlApplicationContext ctx = new CustomClassPathXmlApplicationContext(
                location);
        System.out.println("ctx = " + ctx);
    }

}
