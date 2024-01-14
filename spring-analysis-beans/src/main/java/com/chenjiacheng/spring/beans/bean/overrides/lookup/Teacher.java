package com.chenjiacheng.spring.beans.bean.overrides.lookup;

/**
 * Created by chenjiacheng on 2024/1/15 00:17
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class Teacher extends User{
    @Override
    public void showMe() {
        System.out.println("Teacher.showMe");
    }
}
