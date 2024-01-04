package com.chenjiacheng.spring.beans.bean.basic;

import lombok.Data;

/**
 * Created by chenjiacheng on 2023/12/17 16:06
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
@Data
public class CustomBean {
    private String testStr = "testStr";

    public String getTestStr() {
        return testStr;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }
}
