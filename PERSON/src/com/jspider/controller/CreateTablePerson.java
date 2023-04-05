package com.jspider.controller;
import com.jspider.service.PersonService;
public class CreateTablePerson {
	
	public static void main(String[] args) {
		PersonService personService = new PersonService();
		personService.createPersonnTable();
		System.out.println("table created successfully.....");
	}
}
	