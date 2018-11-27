<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main Registration Page</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="register" method="post">
	<table cellpadding="3pt">
		<tr>
			<td> User Name: </td>
			<td><input type="text" name="username" size="30" /></td>
		</tr>
		<tr>
			<td> Password: </td>
			<td><input type="text" name="password" size="30" /></td>
		</tr>
		<tr>
			<td> Confirm Password: </td>
			<td><input type="text" name="confirmPassword" size="30" /></td>
		</tr>
		<tr>
			<td> Email ID: </td>
			<td><input type="text" name="emailid" size="30" /></td>
		</tr>
		<tr>
			<td> Mobile Number: </td>
			<td><input type="text" name="mobileNo" size="30" /></td>
		</tr>
		<tr>
			<td> City: </td>
			<td><input type="text" name="city" size="30" /></td>
		</tr>
	</table>
	<input type="submit" value="Register" />
</form>
</body>
</html>