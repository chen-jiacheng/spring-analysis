package com.chenjiacheng.spring.beans.bean.overrides;

import com.chenjiacheng.spring.beans.bean.overrides.replace.TestChangeMethod;
import com.chenjiacheng.spring.beans.util.BeanFactoryUtil;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by chenjiacheng on 2024/1/15 00:14
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class ReplacedMethodTest {

    @Test
    public void replacedMethodTest(){
        BeanFactory factory = BeanFactoryUtil.ofPath("bean/spring-beans-overrides.xml");
        TestChangeMethod test = (TestChangeMethod) factory.getBean("testChangeMethod");
        test.changeMe();
    }

}
