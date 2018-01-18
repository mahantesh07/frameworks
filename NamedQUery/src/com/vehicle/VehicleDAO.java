package com.vehicle;

import org.hibernate.Session;

import com.app.singleton.SingleTonSessionFactory;

public class VehicleDAO {
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.setVehicleType("TwoWheeler");
	Session session=SingleTonSessionFactory.getSf().openSession();
	
	session.save(v);
	session.beginTransaction().commit();
	session.close();
}
}
