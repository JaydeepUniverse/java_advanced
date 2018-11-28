package com;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

public class Test {
public static void main(String[] args) {
    Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
    
    org.hibernate.Transaction t = session.beginTransaction();
    Student student1 = new Student();
    student1.setId(1);
    student1.setName("kkk");
    student1.setRoll("111");
    student1.setDegree("kkk");
    student1.setPhone("111");
    Student student2 = new Student();
    student2.setId(2);
    student2.setName("jjj");
    student2.setRoll("222");
    student2.setDegree("jjj");
    student2.setPhone("222");
    
    session.persist(student1);
    session.persist(student2);
    t.commit();
    session.close();
    System.out.println("successfully saved");
}
}
