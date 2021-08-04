package com.Tutorials;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeApp {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg2.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Employee employee = new Employee();
		employee.setEmpId(1001);
		employee.setEmpName("Jeera");
		employee.setEmpAddress("INDIA");

		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		session.save(employee);

		transaction.commit();

		session.close();

		System.out.println("Employee Details :- " + employee);
	}

}
