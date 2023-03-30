<%@page import="com.jsp.dto.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%Person person = (Person)request.getAttribute("per"); %>
<form action="updateservlet">
Id: <input type="number" name="id"value="<%=person.getId()%>"><br>
Enter name:<input type="text" name="name" value="<%=person.getName()%>"><br>
Enter age:<input type="number" name="age" value="<%=person.getAge()%>"><br>
Enter email:<input type="email" name="email" value="<%=person.getEmail()%>"><br>
Enter password:<input type="password" name="password" value="<%=person.getPassword()%>"><br>
<input type="submit" value="update">

</form>
</body>
</html>