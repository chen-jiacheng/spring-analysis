package com.chenjiacheng.spring.beans.bean.overrides;

import com.chenjiacheng.spring.beans.bean.overrides.lookup.GetBeanTest;
import com.chenjiacheng.spring.beans.util.BeanFactoryUtil;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by chenjiacheng on 2024/1/15 00:14
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class LookupMethodTest {

    /***
     * lookup-method 使用CGLib进行了加强，重写了方法，返回类型不变。
     */
    @Test
    public void lookupMethodTest(){
        BeanFactory factory = BeanFactoryUtil.ofPath("bean/spring-beans-overrides.xml");
        GetBeanTest getBeanTest = (GetBeanTest) factory.getBean("getBeanTest");
        getBeanTest.showMe();
    }

}
