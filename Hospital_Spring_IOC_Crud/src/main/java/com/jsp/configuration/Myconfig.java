package com.jsp.configuration;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.jsp")
@Configuration
public class Myconfig {
@Bean
public EntityManagerFactory createEntityManagerFactory() {
	return Persistence.createEntityManagerFactory("Ganesh");
}
	
}
