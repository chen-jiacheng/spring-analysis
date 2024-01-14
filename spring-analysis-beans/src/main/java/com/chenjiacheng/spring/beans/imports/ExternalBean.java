package com.chenjiacheng.spring.beans.imports;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/14 23:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class ExternalBean {

    private String name;

    public ExternalBean() {
    }

    public ExternalBean(String name) {
        this.name = name;
    }
}
