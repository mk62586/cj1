package com.hibernate.hibernate.Many2Many;



import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Many2ManyDAO {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		Transaction transaction = session.beginTransaction();
		
		Doctor doctor = new Doctor();

		doctor.setDoctorName("Dr Vijay");
		
		
		
		Patient patient = new Patient();
		patient.setPatientName("Amit");
		
		Patient patient1 = new Patient();
		patient1.setPatientName("Sweeta");
		
		List<Patient> list = new ArrayList<Patient>();
		list.add(patient);
		list.add(patient1);
		
		doctor.setPatient(list);
		
		session.save(doctor);
		
		
		
		Doctor dr = new Doctor();
		dr.setDoctorName("Dr Ramesh");
		
		Doctor dr1 = new Doctor();
		dr1.setDoctorName("Dr VShanker");
		
		Patient pa = new Patient();
		pa.setPatientName("Vimal");
	    
	
		List<Doctor> doctorH = new ArrayList<Doctor>();
		doctorH.add(dr);
		doctorH.add(dr1);
		
		pa.setDoctorAdd(doctorH);
		
		session.save(pa);
		
	  
	    transaction.commit();
		session.close();
		factory.close();

	}
}
