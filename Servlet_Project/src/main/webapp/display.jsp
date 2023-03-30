<%@page import="com.jsp.unidirectional.onetoone.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	List<Employee> list =(List<Employee>)request.getAttribute("key_name");
%>

<%
	for(Employee e1 : list){
%>
	<%=e1.getId()%>	
	<%=e1.getName() %>
	<%=e1.getAge() %>
	<%=e1.getEmail() %>
	<%=e1.getPassword() %>
	<br>
	<br>
<%
}
%>

</body>
</html>