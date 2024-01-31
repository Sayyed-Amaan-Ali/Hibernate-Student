package com.hib.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class test01 {
	public static void main(String args[]) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		System.out.println("1");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Students students=new Students();
		
		students.getId();
		students.getName();
		System.out.println("2");
		
	}
}
