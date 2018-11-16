package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.crypto.provider.RSACipher;

public class Add7 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int i = Integer.parseInt(req.getParameter("number1"));
	int j = Integer.parseInt(req.getParameter("number2"));
	int k = i + j;
	Cookie c = new Cookie("k", k+"");
	res.addCookie(c);
	res.sendRedirect("sq7");
	System.out.println("addition is here");
    }
}
