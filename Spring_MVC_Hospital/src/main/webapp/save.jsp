<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form:form action = "save"  modelAttribute = "loading">
Enter id: <form:input path="id"/>
Enter Name: <form:input path="name"/>
Enter Website: <form:input path="website"/>
Enter rating: <form:input path="rating"/>
Enter phone: <form:input path="phone"/>
<form:button>save</form:button>
</form:form>
</body>
</html>