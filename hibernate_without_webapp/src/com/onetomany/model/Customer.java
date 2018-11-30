package com.onetomany.model;

import java.util.Date;

public class Customer {
    private long customerid;
    private String firstname;
    private String lastname;
    private Date birthdate;
    private String phone;
    private Bank bank;
    
    public Customer(String firstname, String lastname, Date birthdate, String phone) {
	this.firstname = firstname;
	this.lastname = lastname;
	this.birthdate = birthdate;
	this.phone = phone;
    }

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
    
    
}
