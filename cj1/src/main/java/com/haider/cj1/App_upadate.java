package com.haider.cj1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App_upadate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("mk1");
		EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = createEntityManager.getTransaction();
		transaction.begin();
		
		StudentModel find = createEntityManager.find( StudentModel.class, 1);
		find.setName("Vaibahv");
		find.setRoll(343);
		
		createEntityManager.persist(find);
		
		transaction.commit();
		
		createEntityManager.close();
		createEntityManagerFactory.close();
	}	
}
