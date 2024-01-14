package com.chenjiacheng.spring.beans.util;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 * Created by chenjiacheng on 2024/1/7 15:27
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomXmlParsingToolTest {

    @Test
    public void parsingTest() throws Exception {
        String path = "";
        Document document = CustomXmlParsingTool.parsing(path);
        Element root = document.getDocumentElement();
        System.out.println("root = " + root);
    }

}
