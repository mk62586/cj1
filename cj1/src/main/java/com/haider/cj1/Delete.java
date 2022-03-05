package com.haider.cj1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete {

	public static void main(String[] args) {

		
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("mk1");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();

	    EntityTransaction transaction = entityManager.getTransaction();
	    
	    
	    transaction.begin();
	    
	    StudentModel  st =entityManager.find( StudentModel.class,1);
	    entityManager.remove(st);
	    
	    transaction.commit();
	    
	    entityManager.close();
	    createEntityManagerFactory.close();
	    
	}
}
