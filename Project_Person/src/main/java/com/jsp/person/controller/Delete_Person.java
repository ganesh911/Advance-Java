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

@WebServlet("/delete1")
public class Delete_Person extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1 = req.getParameter("id");
		int id = Integer.parseInt(id1);
		Person_Service personService = new Person_Service();
		Person person = personService.deletePersonService(id);
	
	}

}
