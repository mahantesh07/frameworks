package com.AutoGen.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLDAO {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("configure.xml");
		
		config.addAnnotatedClass(DominosDTO.class);
		
		SessionFactory sf = config.buildSessionFactory();

		Session sess = sf.openSession();
	/*	
		//use hql create the query
		//sess.createQuery("select * from dominos_table where noOfOrders=2")
		String sql="select * from dominos_table where noOforders=2";
		Query qry=sess.createQuery(sql);
		
		//step2:process the result
		c
		System.out.println(dominos.getBranch());
		System.out.println(dominos.getContactno());
		System.out.println(dominos.getNumOforders());
		*/
		
	/*	//to load the all the recordes fromthe db
		String hql="from DominosDTO";
		Query query=sess.createQuery(hql);
		//process the result
		List<DominosDTO> dominos=query.list();
		for (DominosDTO dominosDTO : dominos) {
			System.out.println(dominosDTO.getNumOforders());
			System.out.println(dominosDTO.getContactno());
			System.out.println(dominosDTO.getBranch());
		}
		*/
		
		//to select a single clm from the db
	/*	String hql="select branch from DominosDTO  where noOforeders=2";
		Query qry=sess.createQuery(hql);
		
		String branch=(String)qry.uniqueResult();
		System.out.println(branch);
		*/
		
		//select multiple records from db
		String hql="select branch,contactno from DominosDTO  where no_of_orders=2";
		Query qry=sess.createQuery(hql);
		
		Object[] value=(Object[])qry.uniqueResult();//returning more than one object hence we can use object[] or list
		System.out.println(value[0]);
		System.out.println(value[1]);
	}

}