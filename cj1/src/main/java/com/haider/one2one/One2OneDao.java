package com.haider.one2one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class One2OneDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("mk1");

EntityManager createEntityManager = createEntityManagerFactory.createEntityManager();

EntityTransaction transaction = createEntityManager.getTransaction();

transaction.begin();


Father fa = new Father();
fa.setFatherName("Iyer Ramya krishna");

Child ch =  new Child();

ch.setChildName("Sonu");
ch.setAge(19);

ch.setFa(fa);

createEntityManager.persist(ch);

transaction.commit();

createEntityManager.close();
createEntityManagerFactory.close();
	}
}
