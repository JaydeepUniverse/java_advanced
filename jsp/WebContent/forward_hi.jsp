<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forward Page Example</title>
</head>
<body>
<jsp:forward page="forward_info.jsp">
<jsp:param value="Jaydeep" name="name"/>
<jsp:param value="100" name="id"/>
</jsp:forward>
</body>
</html>