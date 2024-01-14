package com.chenjiacheng.spring.beans.bean.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CustomBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        // 在 Bean 初始化之前的逻辑
        System.out.println("Before Initialization - Bean Name: " + beanName);
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                new Class[]{bean.getClass()},
                new CustomProxy(bean)
        );
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        // 在 Bean 初始化之后的逻辑
        System.out.println("After Initialization - Bean Name: " + beanName);

        //创建代理
        // 创建动态代理对象
        // return Proxy.newProxyInstance(
        //         this.getClass().getClassLoader(),
        //         new Class[]{bean.getClass()},
        //         new CustomProxy(bean)
        // );
        return bean;

        // 返回 Bean，可以是原始的 bean，也可以是修改后的 bean
    }

    public static class CustomProxy implements InvocationHandler{

        private Object target;

        public CustomProxy(Object target) {
            this.target = target;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Before method invocation");
            Object result = method.invoke(target, args);
            System.out.println("After method invocation");
            return result;
        }
    }
}
