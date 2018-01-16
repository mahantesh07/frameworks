package com.AutoGen.app;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DyanamicHQLDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration config =new Configuration();
		config.configure("configure.xml");
		
		//obtain  SessionFactory using helper method
				SessionFactory sf=config.buildSessionFactory();
				
				//obtain Session obj for performing CRUD operation
				Session sess=sf.openSession();
				
				//step1 create the query
				/*
				 *String hql="from DominosDTO where no_of_orders=? and branch=?"; 
				 */
				
				/*
				 * using Named parametres...
				 * String hql="from DominosDTO where no_of_orders=:noOforders and branch=:branch";
				 */
			
				
				String hql="select branch,contactno from DominosDTO";
				
				Query qry=sess.createQuery(hql);
				
				/*
				 * qry.setInteger(1, 2);
				 * error
				 * positional parameter doesnot exist
				 * 
				 */
			
			/*
			 * 	qry.setInteger(0, 2);
			 * 	qry.setString(1, "Basavangudi");
			 */
				
			/*qry.setInteger("noOforders", 2);
				qry.setString("branch", "Basavangudi");
			 * 	
			 */
				
					List<Object[]> dominos=qry.list();
			
				
				
				//step2 process the result
				
			/*
			 * 	DominosDTO dominos=(DominosDTO)qry.uniqueResult();
			 * 	System.out.println(dominos.getNumOforders());
			 * 	System.out.println(dominos.getBranch());
			 * 	System.out.println(dominos.getContactno());
			 */
			
				for (Object[] objects : dominos) {
					System.out.println(objects[0]);
					System.out.println(objects[1]);
					System.out.println("-------------------------------");
				}
				
				
				
	}

}
