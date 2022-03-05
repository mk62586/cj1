package com.haider.many2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;





public class Many2ManyDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

      	EntityManagerFactory factory = Persistence.createEntityManagerFactory("mk1");
    	EntityManager entityManager = factory.createEntityManager();
    	EntityTransaction transaction = entityManager.getTransaction();
    	transaction.begin();
    	
    	Person pa = new Person();
    	pa.setPersonName("Ravi");
    	
    	Mobile mob = new Mobile();
    	mob.setMobileName("nokia320");
    	
    	Mobile mob1 = new Mobile();
    	mob1.setMobileName("Sumsung");
    	

		List<Mobile> list = new ArrayList<Mobile>();
		list.add(mob);
		list.add(mob1);
		
		pa.setMobile(list);
		
		entityManager.persist(pa);
		
		
		
		Person pa1 = new Person();
		pa1.setPersonName("Kamal");
		
		Person pa2 = new Person();
		pa2.setPersonName("rahul");
		
	 Mobile m = new Mobile();
	 m.setMobileName("iphone");
	 
	 
		
		List<Person> pe = new ArrayList<Person>();
		pe.add(pa1);
		pe.add(pa2);
		
		
		m.setPerson(pe);
		
		entityManager.persist(m);
		
		transaction.commit();
		
		entityManager.close();
		factory.close();
		
	}
}
