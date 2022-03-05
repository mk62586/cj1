package com.haider.cj1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Read_App1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("mk1");
		EntityManager createEntityManager = managerFactory.createEntityManager();
		 StudentModel  st = createEntityManager.find(StudentModel.class,1);
		 System.out.println(st.getName()+" "+st.getRoll());
		 createEntityManager.close();
		 managerFactory.close();
			
	}
}
