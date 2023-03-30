package com.jsp.demo;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			EntityManagerFactory eMF = Persistence.createEntityManagerFactory("Ganesh");
			EntityManager eM = eMF.createEntityManager();
			Query query = eM.createQuery("select a from Employee a");
			List<Employee> list = query.getResultList();
			if(list.size() > 0) {
				req.setAttribute("key_name", list);
				RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
				dispatcher.forward(req, resp);
			}
 	}
}
