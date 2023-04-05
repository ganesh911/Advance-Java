package com.jsp.person.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.person.dto.Person;
import com.jsp.person.service.Person_Service;

@WebServlet("/getall")
public class Get_All_Person extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person_Service personService = new Person_Service();
		List<Person> list = personService.getAllService();
		if(list.size() > 0 ) {
			req.setAttribute("display", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
	}
}
