package com.jsp.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.configuration.Create;
import com.jsp.dto.Branch;
@Component("dao")
public class Branch_Dao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
	EntityManager entityManager = entityManagerFactory.createEntityManager() ;
	EntityTransaction entityTransaction = entityManager.getTransaction() ;
	
	public Branch insert(Branch branch) {
		entityTransaction.begin() ;
		entityManager.persist(branch) ;
		entityTransaction.commit() ;
		return branch ;
	}
	
	public Branch update(Branch branch) {
		Branch branch1 = entityManager.find(Branch.class, branch.getBranchId()) ;
		if(branch1 != null) {
			entityTransaction.begin() ;
			entityManager.merge(branch1) ;
			entityTransaction.commit();
		}
		return branch1;
	}
	
	public Branch delete(int id) {
		Branch branch2 = entityManager.find(Branch.class, id);
		if(branch2 != null) {
			entityTransaction.begin();
			entityManager.remove(branch2);
			entityTransaction.commit();
		}
		return branch2;
	}
	
	public Branch getId(int id) {
		return entityManager.find(Branch.class, id);
	}
	
	public List<Branch> getAll() {
		Query query = entityManager.createQuery("select a from Branch a");
		return query.getResultList();
	}
}
