package com.jsp.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.jsp.dto.Teacher;
public class TeacherDao {

	public Teacher insertTeacherValue(Teacher teacher){
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return teacher;
	}
	
	public Teacher UpdateTeacherValue(Teacher teacher) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher1 = entityManager.find(Teacher.class, teacher.getId());
		if(teacher1 != null) {
			entityTransaction.begin();
			entityManager.merge(teacher1);
			entityTransaction.commit();
		}
		return teacher1;
	}
	
	public Teacher deleteTeacherObject(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher1 = entityManager.find(Teacher.class, id);
		if(teacher1 != null) {
			entityTransaction.begin();
			entityManager.remove(teacher1);
			entityTransaction.commit();
		}
		return teacher1;
	}
	
	public Teacher getById(int id) {
		EntityManagerFactory entityMangerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityMangerFactory.createEntityManager();
		return entityManager.find(Teacher.class, id);
		
		}
	
	public List<Teacher> getAllTeacher() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select table from Teacher table");
		List<Teacher> list = query.getResultList();
		return list;
	}
	
}
