package com.haider.cj1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 
      	EntityManagerFactory factory = Persistence.createEntityManagerFactory("student");
    	EntityManager entityManager = factory.createEntityManager();
    	EntityTransaction transaction = entityManager.getTransaction();
    	transaction.begin();
		//Answ
		int a =19;
    	
    	StudentModel st = new StudentModel();
    	
    	st.setName("laxman");
    	st.setRoll(255);
    	
    	entityManager.persist(st);
    	
    	transaction.commit();
    	
    	
    	entityManager.close();
    	factory.close();
    }
}
