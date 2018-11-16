<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>1111111</title>
</head>
<body>
<jsp:useBean id="loginInfo" class="com.Login"></jsp:useBean>
<jsp:setProperty property="*" name="loginInfo"/>
<jsp:getProperty property="firstname" name="loginInfo"/>
<jsp:getProperty property="lastname" name="loginInfo"/>
</body>
</html>