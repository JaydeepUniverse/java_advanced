package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import com.bean.User;

public class UserDAO {
    public void addUserDetails(String username, String password, String emailid, String mobileNo, String city) {
	try {
	    Configuration configuration = new Configuration().configure();
	    SessionFactory sessionFactory = configuration.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    Transaction transaction = session.beginTransaction();
	    User user = new User();
	    user.setUsername(username);
	    user.setPassword(password);
	    user.setEmailid(emailid);
	    user.setMobileNo(mobileNo);
	    user.setCity(city);
	//    session.save(user);
	    session.update(user);
	    transaction.commit();
	    System.out.println("\n\n Details Added \n");
	}catch(HibernateException e) {
	    System.out.println(e.getMessage());
	    System.out.println("error");
	}
    }
}
