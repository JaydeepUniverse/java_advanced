<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Demo JSP</title>
</head>
<body>
	<!-- first we're writing directly in expression tag, details to observe, (1) expression tag works like variable usage, (2) there is no semicolon required-->
	<%="Welcome " + request.getParameter("name")%>	
	
	<%
	    String name1=request.getParameter("name");
		out.print(name1);
	%>
</body>
</html>