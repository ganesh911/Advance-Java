package com.jsp.bidirectional.onetoone;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Create_Table_Person_Adhar_Birectional {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ganesh");
		System.out.println("Table created");
	}

}
/**
 * this is unidirectional with this we can access foreign key object
 * but with foreign key object we can' access owning object
 */

// to access both object we use bidirectional mapping