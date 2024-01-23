package com.chenjiacheng.spring.context;

import com.chenjiacheng.spring.context.beans.CustomBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chenjiacheng on 2023/12/12 23:45
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class SpringAnalysisContextApplicationTest {

    private static final String location = "spring-context.xml";

    @Test
    public void contextLoaderTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(location);
        System.out.println("ctx = " + ctx);

        CustomBean customBean = (CustomBean) ctx.getBean("customBean");
        System.out.println("customBean = " + customBean);

    }



}