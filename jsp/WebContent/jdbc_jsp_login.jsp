<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login.jsp example</title>
</head>
<body>
<%@ page import="java.sql.*"%>
<%
String firstname = request.getParameter("firstname");
String lastname = request.getParameter("lastname");
try {
    Class.forName("com.mysql.jdbc.Driver");
    Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/devops", "root", "devops");
    PreparedStatement p = c.prepareStatement("insert into users values(?,?)");

    p.setString(1, firstname);
    p.setString(2, lastname);
    p.executeUpdate();
    ResultSet r = p.executeQuery("select * from users");
    while(r.next())
	System.out.println(r.getString(1) + " " + r.getString(2));
    c.close();
} catch (ClassNotFoundException e) {
    e.printStackTrace();
}

%>
</body>
</html>