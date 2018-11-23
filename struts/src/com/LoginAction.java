package com;

public class LoginAction {
    String username;
    String password;
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
    
    public String execute() {
	if(password.equals("123"))
	    return "login_success";
	else
	    return "login_error";
    }
}
