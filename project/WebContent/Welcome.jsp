<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#mobile_no, #password').click(function() {
			$("#loginMessage").hide();
		});
	});
</script>

<script type="text/javascript">
	$(document).ready(function() {
		$('register_user').click(function() {
			$("#welcomeMessage").hide();
		});
	});
</script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Store - Welcome</title>

</head>
<body>
	<h2>New User ?</h2>
	<a id="register_user" href="Register.html">click here to register and purchase books</a>
	<br>
	<br>
	<h2>Existing User Login Here :</h2>
	<form action="login_user" method="post">
		Mobile No: <input id="mobile_no" type="text" name="mobile_no" />
		Password: <input id="password" type="password" name="password" /> 
		<input id="btn" type="submit" value="Login" />
	</form>
	<br>
	<br>
	<h2>Forgot Password ?</h2>
	<a id="forgot_password" href="ForgotPassword.html">click here to reset the password</a>
	<br>
	<br>
	<h2>Available Books :</h2>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/project" user="root"
		password="devops" />
	<sql:query dataSource="${snapshot}" var="result">
         select * from books;
      </sql:query>
	<table border="1" width="100%">
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Price</th>
		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.Book_ID}" /></td>
				<td><c:out value="${row.Book_Name}" /></td>
				<td><c:out value="${row.Author}" /></td>
				<td><c:out value="${row.Price}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>