package com.onetomany.client;

import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.onetomany.model.Bank;
import com.onetomany.model.Customer;
import com.onetomany.util.HibernateUtil;

public class Test {
    public static void main(String[] args) {
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	
	Session session = sf.openSession();
	session.beginTransaction();
	Bank bank1 = new Bank();
	bank1.setBankname("HDFC");
	session.save(bank1);
	Date birthdate1 = new java.util.Date();
	Customer customer1 = new Customer("Scarlett", "Johansson", birthdate1, "1234567890");
	Customer customer2 = new Customer("Jennifer", "Lawrence", birthdate1, "0987654321");
	
	customer1.setBank(bank1);
	customer2.setBank(bank1);
	
	session.save(customer1);
	session.save(customer2);
	
	Bank bank2 = new Bank();
	bank2.setBankname("ICICI");
	session.save(bank2);
	Date birthdate2 = new java.util.Date();
	Customer customer3 = new Customer("abc", "hello", birthdate2, "6454");
	Customer customer4 = new Customer("xyz", "hi", birthdate2, "546466");
	
	customer3.setBank(bank2);
	customer4.setBank(bank2);
	
	session.save(customer3);
	session.save(customer4);
	
	session.getTransaction().commit();
	session.close();
    }
}
