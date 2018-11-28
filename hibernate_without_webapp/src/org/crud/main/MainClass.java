package org.crud.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.crud.pojo.Employee;

import org.crud.utilcls.HibernateUtil;

public class MainClass {
    public static void main(String[] args) {
		MainClass main = new MainClass();
		main.saveEmployee("a", 100, 123, "pune");
		main.saveEmployee("b", 200, 456, "mumbai");
		main.saveEmployee("c", 300, 789, "nagpur");
		main.retriveEmployee();
		main.deleteEmployee();
		main.updateEmployee();
	    
    }
    
    
    public void saveEmployee(String name, int salary, int phone, String city) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction transaction = null;
	
	try {
	    transaction = session.beginTransaction();
	    Employee employee = new Employee();
	    employee.setEmp_name(name);
	    employee.setEmp_salary(salary);
	    employee.setEmp_phone(phone);
	    employee.setEmp_city(city);
	    
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
	    List employee = session.createQuery("from Employee").list();
	    
	    for(Iterator iterator = employee.iterator(); iterator.hasNext();) {
		Employee employee1 = (Employee)iterator.next();
		System.out.println(employee1.getEmp_name() + " " + employee1.getEmp_salary() + " " + employee1.getEmp_phone() + " " + employee1.getEmp_city());
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
	    String querystring = "from Employee where emp_phone = :phone";
	    Query query = session.createQuery(querystring);
	    query.setInteger("phone", 123);
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
	    String querystring = "from Employee where emp_salary = :salary";
	    Query query = session.createQuery(querystring);
	    query.setInteger("salary", 200);
	    Employee employee = (Employee)query.uniqueResult();
    	    employee.setEmp_salary(60000);
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