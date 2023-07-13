<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action = "save" modelAttribute="key">
Enter id: <form:input path="id"/>
Enter name: <form:input path="name"/>
Enter age: <form:input path="age"/>
<form:button>Register</form:button>
</form:form>
</body>
</html>