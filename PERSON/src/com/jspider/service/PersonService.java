package com.jspider.service;
import java.util.List;

import com.jspider.dao.PersonDao;
import com.jspider.dto.Person;
public class PersonService {

	PersonDao personDao = new PersonDao();
	//to create table 
	public void createPersonnTable()
	{
		personDao.createTablePerson();
	}
	
	//to insert values in the table
	public void  insertValuesInPerson(Person person)
	{
		 personDao.insertValuesInPerson(person);
	}
	
	//to update value in the person 
	public void updateThePerson(Person person) {
		personDao.updateThePerson(person);
	}
	
	//to get all the person
	
	public List<Person> getAllLPerson(){
		
		return personDao.getAllPersons();
	}
}
