package com.chenjiacheng.spring.beans.bean.overrides.lookup;

/**
 * Created by chenjiacheng on 2024/1/15 00:17
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public abstract class GetBeanTest {
    public void showMe(){
        this.getBean().showMe();
    }

    public User getBean(){
        System.out.println("GetBeanTest.getBean");
        return null;
    }

}
