package com.jsp.configuration;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Create_EMF {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		EntityManagerFactory entityManagerFactory =	(EntityManagerFactory) applicationContext.getBean("createEMF");
	}
	

	

	
}
