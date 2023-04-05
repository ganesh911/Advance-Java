package com.jsp.person.service;
import java.util.List;
import com.jsp.person.dao.Person_Dao;
import com.jsp.person.dto.Person;
public class Person_Service {
	Person_Dao personDao = new Person_Dao();
	public Person savePersonService(Person person) {
		return personDao.savePerson(person);			
	}
	public Person updatePersonService(Person person) {
		return personDao.updatePerson(person);
	}
	public Person deletePersonService(int id) {
		return personDao.deletePerson(id);
	}
	public Person getByIdPerson(int id) {
		return personDao.getById(id);
	}
	public List<Person> getAllService(){
		return personDao.getAll();
	}

}
