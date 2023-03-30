package com.jsp.controller;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.Person;
import com.jsp.service.Person_Service;
@WebServlet("/updateservlet")
public class Update_Servlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1 = req.getParameter("id");
		Integer id = Integer.parseInt(id1);
		
		String name = req.getParameter("name");
		
		String age1 = req.getParameter("age");
		int age = Integer.parseInt(age1);
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setAge(age);
		person.setEmail(email);
		person.setPassword(password);
		
		Person_Service personService = new Person_Service();
		
		Person person1 = personService.updatePersonService(person);
		if(person1 != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
			dispatcher.include(req, resp);
		}
}
}
