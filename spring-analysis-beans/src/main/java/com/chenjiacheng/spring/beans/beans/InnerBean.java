package com.chenjiacheng.spring.beans.beans;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/14 23:52
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class InnerBean {

    private String name;

    public InnerBean() {
    }

    public InnerBean(String name) {
        this.name = name;
    }
}
