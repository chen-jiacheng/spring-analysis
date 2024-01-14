package com.chenjiacheng.spring.beans.util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.ClassUtils;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;

/**
 * Created by chenjiacheng on 2023/12/17 13:26
 *
 * @author chenjiacheng
 * @since 1.0.0
 */
public class CustomXmlParsingTool {


    /***
     * 解析xml
     * @param classpath xml文件路径
     * @return 返回文档对象
     */
    public static Document parsing(String classpath) throws Exception {
        if (StringUtils.isEmpty(classpath)) {
            return null;
        }
        return DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(ClassUtils.getDefaultClassLoader().getResourceAsStream(classpath));
    }

    public static void main(String[] args) throws Exception {
        Document document = CustomXmlParsingTool.parsing("spring-beans.xml");
        Element root = document.getDocumentElement();
        //traverse(root);
        parseBeanDefinitions(root);

    }

    private static void parseBeanDefinitions(Element root) {
        NodeList nl = root.getChildNodes();
        for (int i = 0; i < nl.getLength(); i++) {
            Node node = nl.item(i);
            if (node instanceof Element) {
                Element ele = (Element) node;
                parseDefaultElement(ele);
            }
        }
    }

    private static void parseDefaultElement(Element ele) {
        System.out.println(ele.getNodeName());
        NamedNodeMap attributes = ele.getAttributes();
        for (int i = 0; i < attributes.getLength(); i++) {
            Node node = attributes.item(i);
            System.out.println(node.getNodeName()+": "+node.getNodeValue());
        }
        System.out.println();
    }

    private static void traverse(Node node) {
        // 如果当前节点是元素节点
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            System.out.println("Element: " + node.getNodeName());

            // 获取该元素的属性
            if (node.hasAttributes()) {
                System.out.println("Attributes:");
                for (int i = 0; i < node.getAttributes().getLength(); i++) {
                    Node attribute = node.getAttributes().item(i);
                    System.out.println(attribute.getNodeName() + " = " + attribute.getNodeValue());
                }
            }

            // 获取该元素的子节点
            NodeList childNodes = node.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node childNode = childNodes.item(i);
                // 递归调用遍历方法，处理子节点
                traverse(childNode);
            }
        }
        // 如果当前节点是文本节点
        else if (node.getNodeType() == Node.TEXT_NODE) {
            String text = node.getNodeValue().trim();
            if (!text.isEmpty()) {
                System.out.println("Text: " + text);
            }
        }
    }


}
