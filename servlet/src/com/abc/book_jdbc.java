package com.abc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class book_jdbc extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	String a = req.getParameter("first_name");
	String b = req.getParameter("last_name");
	
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
	    PreparedStatement p = c.prepareStatement("insert into users values(?,?)");
	    p.setString(1, a);
	    p.setString(2, b);
	    p.executeUpdate();
	    ResultSet r = p.executeQuery("select * from users");
	    while(r.next())
		System.out.println(r.getString(1) + " " + r.getString(2));
	    c.close();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	PrintWriter pw = res.getWriter();
	pw.print("welcome");
    }
}
