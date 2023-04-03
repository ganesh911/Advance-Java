package com.jsp.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.jsp.configuration.Create_EMF;
import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;

@Component
public class HospitalDao {

	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital insertHospitalDetails(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}
	
	public Hospital updateHospitalDetails(Hospital hospital) {
		Hospital hospital1 = entityManager.find(Hospital.class, hospital.getRegNo());
		if(hospital1 != null) {
			entityTransaction.begin();
			entityManager.merge(hospital);
			entityTransaction.commit();
		}
		return hospital1;
	}
		public Hospital deleteHospitalById(int id) {
			Hospital hospital2 = entityManager.find(Hospital.class, id);
			if(hospital2 != null) {
				entityTransaction.begin();
				entityManager.remove(hospital2);
				entityTransaction.commit();
			}
			return hospital2;
		}
		
	public Hospital getById(int id) {
		return entityManager.find(Hospital.class , id);
	}
	
	public List<Hospital> getAll(){
		Query query = entityManager.createQuery("select a from Hospital a");
		List<Hospital> list = query.getResultList();
		return list;
	}
}
