package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square5 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int k = Integer.parseInt(req.getParameter("k"));
	int z = k*k;
	PrintWriter out = res.getWriter();
	out.println(z);
	System.out.println("square is " + z);
    }
}