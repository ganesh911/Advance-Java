package com.jsp.spring;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class Demo1 {
	@RequestMapping("/demo")
	public ModelAndView test() 
	{
		ModelAndView  andView = new ModelAndView("index.jsp");
		andView.addObject("asd", "Welcome to the Spring world");
		return andView;
	}
	
	@RequestMapping("/demo1")
	public ModelAndView test1() 
	{
		User user = new User();
		user.setAge(12);
		user.setId(122);
		user.setName("ganesh");
		ModelAndView andView = new ModelAndView("user.jsp");
		andView.addObject("abd",user);
		return andView;
	}
	
	@RequestMapping("/load")
		public ModelAndView load() {
			ModelAndView andView = new ModelAndView("save.jsp");
			andView.addObject("key", new User());
			return andView;
		}
	
	
	@RequestMapping("/save")
	public ModelAndView saveUser(@ModelAttribute User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Ganesh");
		EntityManager entityManager  = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		ModelAndView andView = new ModelAndView("msg.jsp");
		
		if(user != null) {
			entityTransaction.begin();
			entityManager.persist(user);
			entityTransaction.commit();
			return andView.addObject("msg", "data is saved");
		}
		return andView.addObject("msg", "data is not saved");
	}
}
