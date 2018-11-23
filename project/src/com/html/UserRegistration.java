package com.html;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegistration extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	String a = req.getParameter("first_name");
	String b = req.getParameter("last_name");

	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "devops");
	    PreparedStatement p = c.prepareStatement("insert into users values(?,?)");
	    p.setString(1, a);
	    p.setString(2, b);
	    p.executeUpdate();
	  
	    c.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
	    Statement s1 = c1.createStatement();
	    ResultSet r1 = s1.executeQuery("select * from books");
	    while(r1.next()) {
		
		System.out.println(r1.getString(1) + " " + r1.getInt(2) + " " + r1.getString(3));
	    }
		
	    c1.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	res.sendRedirect("book.jsp");
    }
}
