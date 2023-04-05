package com.jsp.spring.demo;
import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
//to create IOC container we use core container
public class User_Logic_First {
	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
		First fis = (First)beanFactory.getBean("second");
		fis.test();
		
	}

}
