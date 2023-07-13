package com.spring.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "com.spring")
public class Myconfig {

	@Bean
	public EntityManagerFactory create() {
		return Persistence.createEntityManagerFactory("Ganesh");
	}
}
