package com.chenjiacheng.spring.jdbc.jdbc.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by chenjiacheng on 2024/1/28 23:43
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int id;
    private String name;
    private int age;
    private String sex;

}
