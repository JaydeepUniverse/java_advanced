package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class ResetPassword extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	try {

	    PrintWriter out = res.getWriter();

	    Cookie ck[] = req.getCookies();
	    out.print("Hello " + ck[0].getValue());
	    out.close();

	} catch (Exception e) {
	    System.out.println(e);
	}
    }
}
