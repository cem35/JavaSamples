package com.hibernateDemo;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			
			//Select * from city
			/*
			 * List<City> cities =
			 * session.createQuery("from City c where c.countryCode='TUR' group by c.name").
			 * getResultList();
			 * 
			 * for(City city:cities) { System.out.println(city.getName()); }
			 */
			
			//insert 
			/*
			 * City city = new City(); city.setName("Duzce 10"); city.setCountryCode("TUR");
			 * city.setDistrict("Karadeniz"); city.setPopulation(10000);
			 * 
			 * 
			 * session.save(city);
			 */
			 
			
			// insert
			
			//update
			
//			City city = session.get(City.class, 4080);
//			city.setPopulation(110000);
//			System.out.println(city.getName());
//			
			//update
			
			
			//delete
			City city = session.get(City.class, 4080);
			session.delete(city);
			
			//delete
			
			session.getTransaction().commit();
			
		} finally {
		
			factory.close();
		}
		
		
	}

}
