package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Square6 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	HttpSession session = req.getSession();
	int k = (int)(session.getAttribute("k"));
	int z = k*k;
	
	PrintWriter out=res.getWriter();
	out.println(z);
	System.out.println("square is " + z);
    }
}