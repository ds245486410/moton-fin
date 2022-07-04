package com.moton.motonfin;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author daiweihang
 * @date 2022/7/2
 */
public class SpringXmlMain {
    public static void main(String[] args) {
        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring.xml"));
        SimpleBean simpleBean = factory.getBean("simpleBean", SimpleBean.class);
        System.out.println(simpleBean);

    }
}
