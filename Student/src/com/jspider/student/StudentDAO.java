package com.jspider.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		
		config.addAnnotatedClass(studentDTO.class);
		
		SessionFactory sess=config.buildSessionFactory();
		Session session=sess.openSession();
		
		
		
		//studentDTO s=session.load(studentDTO.class, 45);
		studentDTO s=new studentDTO();
		//session.delete(s);
		
		/*
		 * s.setMarks(340);
		 * s.setName("mahantesh");
		 */	
		
	
	  	s.setName("monty");
	  	s.setId(45);
		s.setMarks(630);
		
		
		session.save(s);
		
		Transaction tr=session.beginTransaction();
		tr.commit();
		
		session.close();

	}

}
