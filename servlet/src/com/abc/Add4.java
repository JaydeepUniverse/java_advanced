package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Add4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String i = req.getParameter("number1");
	String j = req.getParameter("number2");
	String k = i + j;
	req.setAttribute("k", k);
	if (i.equals("mindscripts")) {
	    RequestDispatcher rd = req.getRequestDispatcher("sq4");
	    rd.forward(req, res);
	} else {
	    RequestDispatcher rd = req.getRequestDispatcher("calculator_reqDispatcher2.html");
	    rd.include(req, res);
	}
    }
}
