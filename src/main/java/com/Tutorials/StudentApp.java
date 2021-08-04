package com.Tutorials;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentApp {
	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Student student = new Student();
		student.setId(102);
		student.setName("Raj");
		student.setAddress("Mumbai");
		student.setMobileNumber("9876540321");

		Student student1 = new Student();
		student1.setId(103);
		student1.setName("Sharma");
		student1.setAddress("Birpara");
		student1.setMobileNumber("9807654321");

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(student);
		session.save(student1);

		transaction.commit();

		session.close();

		System.out.println(student);

	}
}
