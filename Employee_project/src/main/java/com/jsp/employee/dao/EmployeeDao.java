	package com.jsp.employee.dao;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import com.jsp.employee.dto.Employee;
import javax.persistence.*;
public class EmployeeDao {
	
	public Employee insertEmployeeDetails(Employee employee) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		return employee;
	}
	public Employee deleteEmployee(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Employee employee1 = entityManager.find(Employee.class,id);//we are finding that object is present or not
		if(employee1 != null) {
			entityTransaction.begin();
			entityManager.remove(employee1);
			entityTransaction.commit();
			
		}
		return employee1;
	
	}
	public Employee updateEmployee(Employee employee) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction(); 
		//here we have to find that our primary key is present or not
		Employee employee1 = entityManager.find(Employee.class,employee.getId());
		if(employee1 != null) {
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();
		}
		return employee1;
	}
	public Employee getBYEmployeeId(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager.find(Employee.class,id);
		
	}
	public List<Employee> getAllEmployee(){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//we can get employee base on id
	//	Query q = entityManager.createQuery("select tables from Employee tables where name=?10");
	//q.setParameter(10, "Rajkumar");
	
		//we can get employee based on name
		//Query q = entityManager.createQuery("select t from EMployee t where name=:f");
		//q.setParameter("f", "Rajkumar");
		Query q = entityManager.createQuery("select a from Employee a");
		List<Employee> list = q.getResultList();
		return list;
	}
}
