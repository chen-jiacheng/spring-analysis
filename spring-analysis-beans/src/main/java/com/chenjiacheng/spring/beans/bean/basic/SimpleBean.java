package com.chenjiacheng.spring.beans.bean.basic;

import lombok.Data;

/**
 * Created by chenjiacheng on 2024/1/15 00:01
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class SimpleBean {

    public void sayHi(){
        System.out.println("SimpleBean.sayHi");
    }

}
