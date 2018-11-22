package com;

import java.sql.Date;

import com.opensymphony.xwork2.ActionSupport;

public class ValidatorAction extends ActionSupport{
    private String name;
    private String email;
    private String password;
    private Date dob;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String execute() {
	return "validator_success";
    }
    
}
