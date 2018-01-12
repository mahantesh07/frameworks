package com.employee.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

	public static void main(String[] args) {
		
		Configuration config=new Configuration();
		config.configure();
		config.addAnnotatedClass(EmployeeDTO.class);

		SessionFactory sf=config.buildSessionFactory();
		Session sess=sf.openSession();
		
		EmployeeDTO emp=new EmployeeDTO();
		emp.setId(1);
		emp.setName("monty");
		emp.setSal(5000);
		
		sess.save(emp);
		
		Transaction tr=sess.beginTransaction();
		tr.commit();
		sess.close();
	}

}
