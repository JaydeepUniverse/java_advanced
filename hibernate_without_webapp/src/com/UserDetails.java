package com;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import com.User;

public class UserDetails {
public static void main(String[] args) {
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    
    org.hibernate.Transaction t = session.beginTransaction();
    User user1 = new User();
    user1.setId(0);
    user1.setUsername("hi");
    user1.setPassword("hi");
    user1.setEmailid("hi@hi.com");
    user1.setMobileNo("45");
    user1.setCity("hi");
    User user2 = new User();
    user2.setId(1);
    user2.setUsername("test");
    user2.setPassword("test");
    user2.setEmailid("test@test.com");
    user2.setMobileNo("5555");
    user2.setCity("test");
    
    session.persist(user1);
    session.persist(user2);
    t.commit();
    session.close();
    System.out.println("successfully saved");
}
}
