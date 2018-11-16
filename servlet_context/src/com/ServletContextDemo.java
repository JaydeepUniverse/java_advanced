package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html");
	
	PrintWriter pw = res.getWriter();
	
	ServletContext sc = getServletContext();
	
	String username=sc.getInitParameter("username");
	pw.println("Username is " + username);
	String useremail=sc.getInitParameter("useremail");
	pw.println("\n Email id is " + useremail);
	pw.close();
    }
}
