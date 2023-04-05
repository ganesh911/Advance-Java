package com.jsp.field_dependency_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Myconfig_Test1_User {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
	EMF emf =	(EMF)applicationContext.getBean("create");
		}
}
