package com.jsp.controller;
import com.jsp.dto.Person;
import com.jsp.service.PersonService;
public class TestSelect {

	public static void main(String[] args) {
		PersonService personService = new PersonService();
		Person person=personService.loginPerson(100, "ganesh@911");
		
		if(person.getMail()!= null) {
			System.out.println("home page");
			
		}
		else {
			System.out.println("login error...");
		}	
	}
}
