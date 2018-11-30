package com.onetomany.model;

import java.util.Set;

public class Bank {
    private long bankid;
    private String bankname;
    private Set<Customer> customers;
    public long getBankid() {
        return bankid;
    }
    public void setBankid(long bankid) {
        this.bankid = bankid;
    }
    public String getBankname() {
        return bankname;
    }
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }
    public Set<Customer> getCustomers() {
        return customers;
    }
    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }
    
     
}
