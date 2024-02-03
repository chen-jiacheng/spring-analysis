package com.chenjiacheng.mybatis.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by chenjiacheng on 2024/1/29 23:58
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;

}
