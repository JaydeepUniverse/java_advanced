package org.crud.utilcls;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    static {
	try {
	    sessionFactory = new Configuration().configure().buildSessionFactory();
	} catch (Throwable e) {
	    System.err.println("sessionfatory creation failed" + e);
	    throw new ExceptionInInitializerError(e);
	}
    }
    public static SessionFactory getSessionFactory() {
	return sessionFactory;
    }
}
