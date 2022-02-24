package com.hibernate.theone.One2Many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.theone.hibernate.One2One.Country;
import com.theone.hibernate.One2One.PrimeMinister;

public class One2ManyDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		Country country = new Country();
		
		country.setCountryName("India");
			
	   Phone iphone = new Phone();
	
	   iphone.setPhId(101);
	   iphone.setPhoneName("iphone");
	   iphone.setPrice(70000);
	   
	   
	   Phone nokia = new Phone();
		
	   nokia.setPhId(102);
	   nokia.setPhoneName("nokia320");
	   nokia.setPrice(50000);
	  
	   
	   Customer customer = new Customer();
	   customer.setPhId(1001);
	   customer.setCustomerName("Alex");
	   
	   List<Phone> list = new ArrayList<Phone>();
	   list.add(iphone);
	   list.add(nokia);
	   
	   customer.setPhone(list);
	   session.save(customer);
	   
	   
	   
	   transaction.commit();
       session.close();
		factory.close();
	}
}
