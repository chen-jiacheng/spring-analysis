package com.chenjiacheng.spring.beans.alias;

import com.chenjiacheng.spring.beans.util.BeanFactoryUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by chenjiacheng on 2024/1/7 15:31
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class AliasBeanFactoryTest {

    private final String config = "alias/spring-beans.xml";

    private BeanFactory beanFactory;

    @Before
    public void init(){
        this.beanFactory = BeanFactoryUtil.ofPath(config);
    }

    @Test
    public void aliasBeanTagTest(){
        Computer computer = (Computer) beanFactory.getBean("computer");
        System.out.println("computer = " + computer);

        Computer computer2 = (Computer) beanFactory.getBean("computer2");
        System.out.println("computer2 = " + computer2);

        Assert.assertEquals(computer,computer2);
    }


}
