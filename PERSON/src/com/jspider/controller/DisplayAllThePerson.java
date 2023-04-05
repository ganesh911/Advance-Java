package com.jspider.controller;
import com.jspider.dto.Person;
import com.jspider.service.PersonService;
import com.jspider.dao.*;
public class DisplayAllThePerson {

	public static void main(String[] args) {
		
		PersonService personService = new PersonService();
	personService.getAllLPerson();
		
	}
}
