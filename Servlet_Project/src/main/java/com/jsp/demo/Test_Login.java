package com.jsp.demo;
import java.io.IOException;
import java.util.List;

import javax.persistence.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/serve")
public class Test_Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String mail = req.getParameter("mail");
		String pass = req.getParameter("pass");
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Query query = entityManager.createQuery("select a from Employee a where email=?1 and password=?2");
		query.setParameter(1,mail);
		query.setParameter(2, pass);
		List<Employee> list = query.getResultList();
		if(list.size() > 0) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);
		}
		else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}	
	}
}
