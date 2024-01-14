package com.chenjiacheng.spring.beans.alias;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/14 23:22
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class Computer {

    private String name;

    public Computer() {
    }

    public Computer(String name) {
        this.name = name;
    }
}
