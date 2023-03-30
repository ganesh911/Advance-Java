package com.jsp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.jsp.dto.Person;
import com.jsp.service.Person_Service;

@WebServlet("/displayperson")
public class Display_All_Person extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Person_Service personService = new Person_Service();
		List<Person> list =  personService.getAllPersonService();
		if(list.size()>0) {
			req.setAttribute("display", list);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Home.jsp");
			dispatcher.include(req, resp);
		}
	}
}
