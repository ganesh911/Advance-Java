package com.jsp.unidirectional.onetoone;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Create_Table_Person_Adhar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ganesh");
		System.out.println(entityManagerFactory);
	}
}
