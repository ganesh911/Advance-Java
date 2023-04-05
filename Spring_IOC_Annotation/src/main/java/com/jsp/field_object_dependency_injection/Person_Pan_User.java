package com.jsp.field_object_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.jsp.field_dependency_injection.Myconfig;

@Component
class Pan{
	public void panNumber() {
		System.out.println("CDFPJ4214H");
	}
}


@Component
class Person{
	@Autowired
	Pan pan;
	public void call() {
		pan.panNumber();
	}
}


public class Person_Pan_User {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		Person person = (Person)applicationContext.getBean("person");
		person.call();
	}
}
