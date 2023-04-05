package com.jspider.controller;
import com.jspider.service.PersonService;
import com.jspider.dto.Person;
public class UpdateThePerson {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person = new Person();
		person.setId(102);
		person.setName("Rajkumar");
		personService.updateThePerson(person);
	}
}
