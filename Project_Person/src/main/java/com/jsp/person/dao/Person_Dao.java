package com.jsp.person.dao;
import java.util.List;

import javax.persistence.*;
import com.jsp.person.dto.Person;

public class Person_Dao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}
	
	public  Person updatePerson(Person person) {
		Person person2 = entityManager.find(Person.class, person.getId());
		if(person2 != null) {
			entityTransaction.begin();
			entityManager.merge(person2);
			entityTransaction.commit();
		}
		return person2;
	}
	
	public Person deletePerson(int id) {
		Person person2 = entityManager.find(Person.class, id);
		if(person2 != null) {
			entityTransaction.begin();
			entityManager.remove(person2);
			entityTransaction.commit();
		}
		return person2;
	}
	
	public Person getById(int id) {
		return entityManager.find(Person.class, id);
	}
	
	public List<Person> getAll(){
		Query query = entityManager.createQuery("select q from Person q");		
		List<Person>  list = query.getResultList();
		return list;	
  	}
}
