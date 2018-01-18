package com.app.namedquery;

import org.hibernate.Query;
import org.hibernate.Session;

import com.app.singleton.SingleTonSessionFactory;

public class DeleteDAO {

	public static void main(String[] args) {
		Session sess=SingleTonSessionFactory.getSf().openSession();
		
		Query qry=sess.getNamedQuery("delete");
		qry.setParameter("name","football");
		qry.executeUpdate();
		sess.beginTransaction().commit();
	}

}
