package com.chenjiacheng.spring.beans.bean.basic;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/15 00:00
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class PropertiesBean {

    private String name;

    public PropertiesBean() {
    }

    public PropertiesBean(String name) {
        this.name = name;
    }
}
