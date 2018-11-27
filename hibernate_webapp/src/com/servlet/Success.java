package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Success extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
	PrintWriter write = res.getWriter();
	write.println("" + "" + "<center>" + "Details Added Successfully" + "</center>" + "" + "");
    }
}
