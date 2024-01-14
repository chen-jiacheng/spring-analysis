package com.chenjiacheng.spring.beans.bean.overrides.replace;


import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by chenjiacheng on 2024/1/15 00:30
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class TestMethodReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        System.out.print("TestMethodReplacer.reimplement\n");
        System.out.println("obj = " + obj + ", method = " + method + ", args = " + Arrays.toString(args));
        return null;
    }
}
