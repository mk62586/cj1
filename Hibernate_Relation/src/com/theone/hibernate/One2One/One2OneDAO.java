package com.theone.hibernate.One2One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2OneDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		Country country = new Country();
		
		country.setCountryName("India");
		
		
	   PrimeMinister pm = new PrimeMinister();
	
	   pm.setPmName("Narendra Modi");
	   pm.setCountry(country);
	   
	   session.save(pm);
	   
	   transaction.commit();

		session.close();
		factory.close();
	}
}
