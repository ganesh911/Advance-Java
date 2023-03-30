package com.jsp.service;
import com.jsp.dao.Person_Dao;
import com.jsp.dto.Person;
import java.util.List;
public class Person_Service {
	Person_Dao personDao = new Person_Dao();
	
	public Person savePersonService(Person person) {
		return personDao.savePerson(person);
	}
	
	public List<Person> getAllPersonService() {
		return personDao.getAllPerson();
	}
	
	public Person getByIdPersonService(int id) {
		return personDao.getByIdPerson(id);
	}
	
	public Person deletePersonService(int id) {
		return personDao.deletePerson(id);
	}
	
	public Person updatePersonService(Person person) {
		return personDao.updatePerson(person);
	}
}
