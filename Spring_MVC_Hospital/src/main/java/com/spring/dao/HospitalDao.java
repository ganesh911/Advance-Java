package com.spring.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import com.spring.dto.Hospital;

@Component
public class HospitalDao {
	
	
	@PersistenceContext
	@Autowired
	//EntityManagerFactory entityManagerFactory;
	EntityManagerFactory entityManagerFactory = 
			Persistence.createEntityManagerFactory("Ganesh");
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public Hospital save(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}
	
	public Hospital update(Hospital hospital) {
		Hospital hospital2 = entityManager.find(Hospital.class, hospital.getId());
		if(hospital2 != null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		return hospital;
	}
	
	public Hospital delete(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if(hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
		}
		return hospital;
	}
	
	public Hospital getId(int id) {
		return entityManager.find(Hospital.class, id);
	}
	
	public List<Hospital> getAll(){
		Query query = entityManager.createQuery("select q from Hospital q");
		List<Hospital> list = query.getResultList();
		return list;
		}
	
}

