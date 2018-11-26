package com;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Test {
public static void main(String[] args) {
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    
    org.hibernate.Transaction t = session.beginTransaction();
    Student student1 = new Student();
    student1.setId(1);
    student1.setName("abc");
    student1.setRoll("1");
    student1.setDegree("BE");
    student1.setPhone("1");
    Student student2 = new Student();
    student2.setId(2);
    student2.setName("pqr");
    student2.setRoll("2");
    student2.setDegree("BE");
    student2.setPhone("2");
    
    session.persist(student1);
    session.persist(student2);
    t.commit();
    session.close();
    System.out.println("successfully saved");
}
}
