package com.jsp.configuration;

import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Create implements EntityManagerFactory{
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return (EntityManagerFactory) Persistence.createEntityManagerFactory("Ganesh");
	}
	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(Myconfig.class);
		EntityManagerFactory entityManagerFactory =(EntityManagerFactory)applicationContext.getBean("entityManagerFactory");
		entityManagerFactory.entityManagerFactory();
	}

}
