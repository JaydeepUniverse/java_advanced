package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class Square7 extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int j=0;
	Cookie cookie[] = req.getCookies();
	PrintWriter out=res.getWriter();
	for(int i=0;i<cookie.length;i++){  
	 //   out.print("<br>"+cookie[i].getName()+" "+cookie[i].getValue());//printing name and value of cookie  
	    if(cookie[i].getValue().equals("k")) {
		j=i;
	    }
	    
	   }
	int a = Integer.parseInt(cookie[j].getValue());
	    int z = a*a;
	    out.print(z);
	
	/*for(Cookie c : cookie) {
	    if(c.equals("k")){
		    k=Integer.parseInt(c.getValue());
	    }*/
	}
	
    }
