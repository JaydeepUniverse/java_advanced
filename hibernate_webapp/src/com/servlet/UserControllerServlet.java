package com.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;

public class UserControllerServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req, HttpServletResponse res) {
	String username = req.getParameter("username");
	String password = req.getParameter("password");
	String emailid = req.getParameter("emailid");
	String mobileNo = req.getParameter("mobileNo");
	String city = req.getParameter("city");
	
	HttpSession session = req.getSession(true);
	try {
	    UserDAO userDao = new UserDAO();
	    userDao.addUserDetails(username, password, emailid, mobileNo, city);
	    res.sendRedirect("success");
	}catch(Exception e) {
	    e.printStackTrace();
	}
    }
}
