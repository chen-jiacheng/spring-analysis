package com.chenjiacheng.spring.aop.aop;

/**
 * Created by chenjiacheng on 2024/1/23 22:20
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class TestBean {
    private String testStr = "testStr";
    public String getTestStr(){
        return testStr;
    }

    public void setTestStr(String testStr){
        this.testStr = testStr;
    }

    public void test(){
        System.out.println("TestBean.test");
    }

}
