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

public class ServletJdbc extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
	int a = Integer.parseInt(req.getParameter("id"));
	String b = req.getParameter("name");
	
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
	    PreparedStatement p = c.prepareStatement("insert into data values(?,?)");
	    p.setInt(1, a);
	    p.setString(2, b);
	    p.executeUpdate();
	    ResultSet r = p.executeQuery("select * from data");
	    while(r.next())
		System.out.println(r.getInt(1) + " " + r.getString(2));
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
