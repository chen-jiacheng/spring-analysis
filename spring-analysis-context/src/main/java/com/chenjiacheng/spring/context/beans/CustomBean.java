package com.chenjiacheng.spring.context.beans;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/16 23:35
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class CustomBean {

    private String name;

    public CustomBean(String name) {
        this.name = name;
        System.out.println("CustomBean.CustomBean");
    }
}
