package com.jspider.controller;
import com.jspider.dto.Person;
import com.jspider.service.PersonService;
public class InertValuesInPerson {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = new Person();
		person.setId(101);
		person.setName("Pradip");
		person.setAge(99);
		person.setEmail("pradip@gmail.com");
		person.setPassword("P@123");
		personService.insertValuesInPerson(person);
		 
	}
}
