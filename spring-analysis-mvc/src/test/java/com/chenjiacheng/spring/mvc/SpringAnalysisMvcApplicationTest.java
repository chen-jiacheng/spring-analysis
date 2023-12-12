package com.chenjiacheng.spring.mvc;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Created by chenjiacheng on 2023/12/12 23:47
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
// @RunWith(SpringRunner.class)
// @ContextConfiguration("classpath:/spring-context.xml")
@SpringJUnitConfig(locations = "classpath:/spring-context.xml")
public class SpringAnalysisMvcApplicationTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void contextLoaderTest() {
        assert ctx != null;
    }
}