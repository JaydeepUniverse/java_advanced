package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square3 extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int k = (int) req.getAttribute("k");
	int z = k * k;
	PrintWriter out = res.getWriter();
	out.println(z);
	System.out.println("square is " + z);
    }
}