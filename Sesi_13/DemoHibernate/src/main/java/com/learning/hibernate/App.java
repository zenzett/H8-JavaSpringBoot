package com.learning.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import com.learning.hibernate.AddressBook;

public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();

		Transaction tx = session.beginTransaction();

		AddressBook emp = new AddressBook();

		emp.setId(1);
		emp.setName("Zain");
		emp.setAddress("Depok");

		session.save(emp);

		tx.commit();
	}
}
