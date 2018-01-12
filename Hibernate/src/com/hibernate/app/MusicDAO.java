package com.hibernate.app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MusicDAO {

	public static void main(String[] args) {
		
		//create obj of DTO and populate the Values
		
		MusicDTO music	=new MusicDTO();
		music.setName("mmmmm");
		music.setArtist("fonsi");
		music.setLength(4);
		music.setYearOfRelease(2017);
		
		
		//create an Object of Configuration
		Configuration config =new Configuration();
		
		
		
		//to load the Resource
		//load hibernate.cfg.xml
		config.configure();
		
		config.addAnnotatedClass(MusicDTO.class);
		
		//obtain  SessionFactory using helper method
		SessionFactory sf=config.buildSessionFactory();
		
		//obtain Session obj for performing CRUD operation
		Session sess=sf.openSession();
		
		sess.save(music);
		
	Transaction t=sess.beginTransaction();
		
		
		
		
		t.commit();
		
		sess.close();
		
		
	}

}
