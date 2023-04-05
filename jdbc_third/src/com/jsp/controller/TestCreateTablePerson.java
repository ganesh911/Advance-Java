package com.jsp.controller;

//import com.jsp.dto.Person;
import com.jsp.service.PersonService;

public class TestCreateTablePerson {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		//personService.createTableService();
		//System.out.println("table is created");
		
		personService.createTableService();
		System.out.println("Object is created");
		
		
	}
}
