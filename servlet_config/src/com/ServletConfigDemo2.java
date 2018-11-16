package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo2 extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	res.setContentType("text/html;charset=UTF-8");
	
	PrintWriter pw = res.getWriter();
	
	ServletConfig sc = getServletConfig();
	
	Enumeration<String> e = sc.getInitParameterNames();
	/*String str1 = sc.getInitParameter("username");
	pw.println(str1);
	String str2 = sc.getInitParameter("useremail");
	pw.println(str2)*/;
	String str;
	while(e.hasMoreElements()) {
	    str=e.nextElement();
	    pw.println("<br> paramName : " + str);
	    pw.println("paramValue : " + sc.getInitParameter(str));
	}
    }
}
