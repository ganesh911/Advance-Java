package com.jsp.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
public class Create_Container {

	public static void main(String[] args) {
		ClassPathResource  resource = new ClassPathResource("myspring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		First_Spring fS = (First_Spring)beanFactory.getBean("first");
		fS.display();
	}
}
