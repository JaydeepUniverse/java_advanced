<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*,java.io.*,java.util.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Store - Books</title>
</head>
<body>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/project" user="root"
		password="devops" />

	<sql:query dataSource="${snapshot}" var="result">
         SELECT * from books;
      </sql:query>

	<table border="1" width="100%">
		<tr>
			<th>Book Names</th>
			<th>Price</th>
			<th>Author</th>
			<th>Purchase</th>

		</tr>

		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.book_name}" /></td>
				<td><c:out value="${row.price}" /></td>
				<td><c:out value="${row.author}" /></td>
<td><c:out value="${row.author}" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>