package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Add6 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int i = Integer.parseInt(req.getParameter("number1"));
	int j = Integer.parseInt(req.getParameter("number2"));
	int k = i + j;
	HttpSession session = req.getSession();
	session.setAttribute("k", k);
	res.sendRedirect("sq6");
	System.out.println("addition is "+ k);
    }
}
