package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Branch;
import com.jsp.service.Branch_Service;

public class Delete_Branch {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Branch_Service branchService = (Branch_Service)applicationContext.getBean("service");
		
		Branch branch = branchService.deleteService(100);
		
		if(branch != null) {
			System.out.println("Object is deleted....");
		}
		else {
			System.out.println("Object is empty");
		}
	}
}
