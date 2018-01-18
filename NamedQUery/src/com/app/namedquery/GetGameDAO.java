package com.app.namedquery;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.app.singleton.SingleTonSessionFactory;

public class GetGameDAO {

	public static void main(String[] args) {
		
		Session sess=SingleTonSessionFactory.getSf().openSession();
		
		Query qry1=sess.getNamedQuery("getByDuration");
		qry1.setParameter("duration", 90);
		
		Query qry2=sess.getNamedQuery("getByName");
		qry2.setParameter("name","cricket");
		
		List<GameDTO> game=qry1.list();
		for (GameDTO gameDTOs : game) {
			System.out.println(gameDTOs.getDuration());
			System.out.println(gameDTOs.getGameName());
			System.out.println(gameDTOs.getNumberOfPlayers());
			System.out.println(gameDTOs.getType());
			System.out.println("----------------------------");
		}
			List<GameDTO> game2=qry2.list();
			for (GameDTO gameDTOs2 : game2) {
				System.out.println(gameDTOs2.getGameName());
				System.out.println(gameDTOs2.getDuration());
				System.out.println(gameDTOs2.getNumberOfPlayers());
				System.out.println(gameDTOs2.getType());
				System.out.println("----------------------------");
			}
		}
	}

