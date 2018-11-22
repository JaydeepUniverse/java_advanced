<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validator Example</title>
</head>
<body>
<s:form action="login_validator">
<s:textfield name="name" lable="Enter Name"></s:textfield>

<s:textfield name="email" lable="Enter Email ID"></s:textfield>

<s:password name="password" lable="Enter Password"></s:password>

<s:textfield name="dob" lable="Enter date of birth"></s:textfield>

<s:submit value="login_validator"></s:submit>
</s:form>
</body>
</html>