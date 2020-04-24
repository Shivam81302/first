package com.record;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Studentdemo {
	public static void main(String[] args)
	{
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		Session session = factory.getCurrentSession();

		try {
			System.out.println("Creating new student object...");
			Student tempStudent = new Student("Shivam", "Aggarwal", "shivam.agarwal@techchefz.com");
			session.beginTransaction();
			System.out.println("Saving the Student");
			session.save(tempStudent);
			session.getTransaction().commit();
			System.out.println("Done..!!");
			
		}
		finally {
			factory.close();
		}
	}

}
