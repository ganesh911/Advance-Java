package com.jsp.person.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.person.dto.Person;
import com.jsp.person.service.Person_Service;

@WebServlet("/create")
public class Create_Person extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1 = req.getParameter("id");
		int id = Integer.parseInt(id1);
		String age1 = req.getParameter("age");
		int age = Integer.parseInt(age1);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		Person person = new Person();
		person.setId(id);
		person.setName(name);
		person.setEmail(email);
		person.setAge(age);
		person.setPassword(password);
		Person_Service personService = new Person_Service();
		Person person2  = personService.savePersonService(person);
		if(person2 != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("save.jsp");
			dispatcher.include(req, resp);
		}
	}
}
