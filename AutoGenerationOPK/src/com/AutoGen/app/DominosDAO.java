package com.AutoGen.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DominosDAO {

	public static void main(String[] args) {

		DominosDTO dominos = new DominosDTO();

		dominos.setBranch("Basavangudi");
		dominos.setContactno(8886886);
		// dominos.setNumOforders(4); no need of this here

		Configuration config = new Configuration();

		config.configure();

		 config.addAnnotatedClass(DominosDTO.class);

		SessionFactory sf = config.buildSessionFactory();

		Session sess = sf.openSession();

		sess.save(dominos);

		sess.beginTransaction().commit();

	}

}
