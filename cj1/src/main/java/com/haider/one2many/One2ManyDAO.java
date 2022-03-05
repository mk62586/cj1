package com.haider.one2many;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;



public class One2ManyDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mk1");
		EntityManager createEntityManager = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = createEntityManager.getTransaction();

		transaction.begin();
		
		Users user = new Users();
		user.setMeetId(101);
		user.setUserName("Aniket");
		
		Users user1 = new Users();
		user1.setMeetId(102);
		user1.setUserName("yash");
		
		Users user2 = new Users();
		user2.setMeetId(103);
		user2.setUserName("Cheetan");

		GoogleMeetSession meet = new GoogleMeetSession();
		meet.setMeetId(1001);
		meet.setSessionOwner("Azam sir");
		meet.setCourse("JAVA");
		
		   List<Users> list = new ArrayList<Users>();
		   list.add(user);
		   list.add(user1);
		   list.add(user2);
		   
		   meet.setUsers(list);
		   
		   createEntityManager.persist(meet);
		   
		   transaction.commit();
		   
		   createEntityManager.close();
		   
		    entityManagerFactory.close();
		

	}
}
