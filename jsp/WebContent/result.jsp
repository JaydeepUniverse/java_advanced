<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp example</title>
</head>
<body>
	<h1>Using Get method to read form data</h1>
	<ul>
		<li>
			<p>
				First Name :
				<%=request.getParameter("firstname")%>
			</p>
		</li>
		<li>
			<p>
				Last Name :
				<%=request.getParameter("lastname")%>
			</p>
		</li>
	</ul>
</body>
</html>