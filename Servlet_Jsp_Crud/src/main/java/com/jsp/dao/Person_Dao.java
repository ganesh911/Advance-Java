package com.jsp.dao;
import com.jsp.dto.Person;
import java.util.*;
import javax.persistence.*;
public class Person_Dao {
	
	public Person savePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		if(person != null) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		}
		return person;
	}
	
	public List<Person> getAllPerson(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select r from Person r");
		List<Person> list = query.getResultList();
		return list;
	}
	
	public Person getByIdPerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Person.class, id);
	}
	
	public Person deletePerson(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person2 = entityManager.find(Person.class, id);
		if(person2 != null) {
			entityTransaction.begin();
			entityManager.remove(person2);
			entityTransaction.commit();
		}
		return person2;
	}
	
	public Person updatePerson(Person person) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person person2 = entityManager.find(Person.class, person.getId());
		if(person2 != null) {
			entityTransaction.begin();
			entityManager.merge(person);
			entityTransaction.commit();
		}
		return person2;
	}
}
