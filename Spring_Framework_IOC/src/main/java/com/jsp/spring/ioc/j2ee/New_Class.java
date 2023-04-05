package com.jsp.spring.ioc.j2ee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class New_Class {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("NewFile.xml");
	Demo2 d = (Demo2)applicationContext.getBean("one");
	d.dis();
}
	
}
