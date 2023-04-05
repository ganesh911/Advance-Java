package com.jsp.controller;
import com.jsp.dto.Person;
import com.jsp.service.PersonService;
public class TestInsertValue {

	public static void main(String[] args) {
		Person person = new Person();
		person.setId(102);
		person.setName("Nishikant");
		person.setAge(45);
		person.setMail("nishikant@gmail.com");
		person.setPassword("nishi@911");
		
		PersonService personService = new PersonService();
		int res = personService.insertValue(person);
		if(res>0) {
			System.out.println("data saved");
		}
	}
}
