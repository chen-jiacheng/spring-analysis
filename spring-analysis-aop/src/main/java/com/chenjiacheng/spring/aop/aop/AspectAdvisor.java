package com.chenjiacheng.spring.aop.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by chenjiacheng on 2024/1/23 22:25
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Aspect
public class AspectAdvisor {

    @Pointcut("execution(* *.test(..))")
    public void test(){
        System.out.println("AspectAdvisor.test "+this);
    }


    @Before("test()")
    public void beforeTest(){
        System.out.println("AspectAdvisor.beforeTest "+this);
    }

    @After("test()")
    public void afterTest(){
        System.out.println("AspectAdvisor.afterTest "+this);
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint p){
        System.out.println("AspectAdvisor.aroundTest "+this);
        Object o = null;
        try {
            o = p.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("AspectAdvisor.aroundTest "+this);
        return o;
    }



}
