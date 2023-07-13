package com.jsp.controller;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Branch;
import com.jsp.service.Branch_Service;

public class Save_Branch {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(Myconfig.class);
		
		Branch_Service branchService = (Branch_Service)applicationContext.getBean("service");
		
		Branch branch = (Branch)applicationContext.getBean("branch");
		branch.setBranchId(150);
		branch.setBranchname("third");
		branch.setBranchLocation("Madhapur");
		
		Branch branch1 = branchService.insertService(branch);
		
		if(branch1 != null) {
			System.out.println("Data is saved");
		}
		
		else {
			System.out.println("Data is not saved");
		}
	}
}
