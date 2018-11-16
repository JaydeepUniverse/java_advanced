package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add2 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int i=Integer.parseInt(req.getParameter("number1"));
	int j=Integer.parseInt(req.getParameter("number2"));
	int k = i + j;
	PrintWriter out = res.getWriter();
	out.println(k);
	System.out.println("addition is " + k);
    }
}
