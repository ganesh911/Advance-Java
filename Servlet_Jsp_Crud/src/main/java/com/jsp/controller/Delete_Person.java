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
@WebServlet("/delete")
public class Delete_Person extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id1 = req.getParameter("id");
		int id = Integer.parseInt(id1);
		Person_Service personService = new Person_Service();
		Person person = personService.deletePersonService(id);
		if(person != null) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("Home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("delete.jsp");
			dispatcher.include(req, resp);
		}
	}

}
