package com.app.namedquery;

import org.hibernate.Query;
import org.hibernate.Session;

import com.app.singleton.SingleTonSessionFactory;

public class UpdateDAO {

	public static void main(String[] args) {
		Session sess=SingleTonSessionFactory.getSf().openSession();

		String hql="update GameDTO set duration=100 where gameName=:name";
		Query qry=sess.createQuery(hql);
		qry.setParameter("name", "cricket");
		
		qry.executeUpdate();
		sess.beginTransaction().commit();
		

	}

}
