package com;

import com.opensymphony.xwork2.ActionSupport;

public class CustomValidator extends ActionSupport{
    String username;
    String password;
    @Override
    public void validate() {
	if(username.length() < 2)
	    addFieldError("username", "username length must be greather than 2 and less than 5!");
	else if(username.length() > 4)
		addFieldError("username", "username length must be greather than 2 and less than 5!");
	if(password.length() < 5)
	    addFieldError("password", "password length must be greater than 5");
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String execute() throws Exception{
	return "login_success2";
    }
}
