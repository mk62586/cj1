package com.haider.many2one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Many2One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mk1");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = createEntityManager.getTransaction();

		transaction.begin();
		
		Country country = new Country();
		country.setCountryName("India");
		
		
		State state = new State();
		state.setStateName("jharkhand");
		state.setCountry(country);
		createEntityManager.persist(state);
		
		State state1 = new State();
		state1.setStateName("West Bengal");
		state1.setCountry(country);
		createEntityManager.persist(state1);
		
		State state2 = new State();
		state2.setStateName("MadhyaPradesh");
		state2.setCountry(country);
		createEntityManager.persist(state2);
		
		transaction.commit();
		}
}
