<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo JSP</title>
</head>
<body>
	<%@ page import="java.util.Date"%>
	<!-- Declaration Tag Example -->
	<%!int a = 15;
    String name1 = "Jaydeep";
    String name2 = "Soni";%>

	<!-- Expression Tag Example -->
	<%=name1%>
	<%=a%>

	<!-- Scriptlet Example -->
	<%
	    Date d = new Date();
	    out.println("current date and time = " + d);
	%>
</body>
</html>