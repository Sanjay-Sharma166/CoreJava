package com.yash.ems.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil
{
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(com.yash.ems.model.Employee.class);
			return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new RuntimeException("SessionFactory Creation Failed ");
		}
	}

	public Session getSession(){
		return this.sessionFactory.openSession();
	}

}
