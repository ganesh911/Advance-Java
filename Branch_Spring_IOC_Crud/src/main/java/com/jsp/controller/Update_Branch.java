package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Branch;
import com.jsp.service.Branch_Service;

public class Update_Branch {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Branch_Service branchService = (Branch_Service)applicationContext.getBean("service");
		
		Branch branch = (Branch)applicationContext.getBean("branch");
		branch.setBranchId(120);
		branch.setBranchLocation("Punjagutta");
		branch.setBranchname("Second");
		
		Branch branch1 = branchService.updateService(branch);
		
		if(branch1 != null) {
			System.out.println("Data is updated.........");
		}
		else {
			System.out.println("Data is not found based on your id..");
		}
	}
}
