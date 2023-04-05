package com.jsp.service;
import java.util.*;
import com.jsp.dao.PersonDao;
import com.jsp.dto.Person;
public class PersonService {
	PersonDao dao = new  PersonDao();
	//Person person = new  Person();
	public void createTableService() {
		dao.createPersonTable();
		
	}
	
	public int  insertValue(Person person) {
		return dao.insertValueInPersonTable(person);
	}
	
	public List<Person> getPerson() {
		return dao.getPerson();
	}
	
	public Person loginPerson(int id , String password) {
		
		return dao.loginPerson(id, password);
		
	}
}
