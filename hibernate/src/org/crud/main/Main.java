package org.crud.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.crud.pojo.Employee;

import org.crud.utilcls.HibernateUtil;

public class Main {
    public Main() {
	Main main = new Main();
	main.saveEmployee("a", "pune", 100, 123);
	main.saveEmployee("b", "mumbai", 200, 456);
	main.saveEmployee("c", "nagpur", 300, 789);
	main.retriveEmployee();
	main.deleteEmployee();
	main.updateEmployee();
    }
    
    public void saveEmployee(String name, String city, int sal, int phone) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	
	try {
	    transaction = session.beginTransaction();
	    Employee employee = new Employee();
	    employee.setName(name);
	    employee.setCity(city);
	    employee.setSalary(sal);
	    employee.setPhone(phone);
	    
	    session.save(employee);
	    transaction.commit();
	    System.out.println("records inserted success");
	} catch (HibernateException e) {
	    transaction.rollback();
	    e.printStackTrace();
	} finally {
	    session.close();
	}
    }
    
    public void retriveEmployee() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
	    transaction = session.beginTransaction();
	    List employee = session.createQuery("from employee").list();
	    
	    for(Iterator iterator = employee.iterator(); iterator.hasNext();) {
		Employee employee1 = (Employee)iterator.next();
		System.out.println(employee1.getName() + " " + employee1.getCity() + " " + employee1.getSalary() + " " + employee1.getPhone());
	    } 
	    transaction.commit();
	} catch (HibernateException e) {
	    transaction.rollback();
	    e.printStackTrace();
	}finally {
	    session.close();
	}
    }
    
    public void deleteEmployee() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
	    transaction = session.beginTransaction();
	    String querystring = "from employee where phone = :phone";
	    Query query = session.createQuery(querystring);
	    query.setInteger("phone", 123456789);
	    Employee employee = (Employee)query.uniqueResult();
	    session.delete(employee);
	    System.out.println("employee records deleted successfully");
	    //transaction.commit();
	} catch (HibernateException e) {
	    transaction.rollback();
	    e.printStackTrace();
	}finally {
	    session.close();
	}
    }
    
    public void updateEmployee() {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	try {
	    transaction = session.beginTransaction();
	    String querystring = "from employee where salary = :salary";
	    Query query = session.createQuery(querystring);
	    query.setInteger("sal", 50000);
	    Employee employee = (Employee)query.uniqueResult();
    	    employee.setSalary(60000);
    	    session.update(employee);
	    System.out.println("employee records updated successfully");
	    //transaction.commit();
	} catch (HibernateException e) {
	    transaction.rollback();
	    e.printStackTrace();
	}finally {
	    session.close();
	}
}
}