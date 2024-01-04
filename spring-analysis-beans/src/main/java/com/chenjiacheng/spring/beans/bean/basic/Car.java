package com.chenjiacheng.spring.beans.bean.basic;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by chenjiacheng on 2023/12/28 00:41
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class Car implements Serializable {
    private int maxSpeed;
    private String brand;
    private double price;
}
