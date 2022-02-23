package com.soy.hibernate.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.soy.hibernate.model.Students;



public class StudentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Transaction tra = session.beginTransaction();
	     
		/*Query query = session.createQuery("from Students");
		List list = query.list();
		list.forEach(System.out::println);*/
		
		//with condition
		Query query = session.createQuery("from Students where id=104");
		Students st = (Students) query.uniqueResult();
		
		System.out.println(st);
		
		
		tra.commit();
	}
}
