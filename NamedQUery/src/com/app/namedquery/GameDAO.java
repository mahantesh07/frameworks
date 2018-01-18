package com.app.namedquery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.singleton.SingleTonSessionFactory;

public class GameDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GameDTO game = new GameDTO();
		game.setGameName("cricket");
		game.setDuration(90);
		game.setNumberOfPlayers(11);
		game.setType("Outdoor");
		
		Session sess=SingleTonSessionFactory.getSf().openSession();
		
		
		sess.save(game);
		
		Transaction tr = sess.beginTransaction();
		tr.commit();
		sess.close();
		

		/*
		 * Session sess = SingleTonSessionFactory.getSf().openSession();
	 	Query qry = sess.getNamedQuery("delete");
		qry.setParameter("name", "crickeT");
		qry.executeUpdate();
		Transaction tr = sess.beginTransaction();
		tr.commit();
		 */
		
	}

}
