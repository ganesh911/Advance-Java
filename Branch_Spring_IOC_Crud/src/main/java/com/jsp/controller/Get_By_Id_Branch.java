package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Branch;
import com.jsp.service.Branch_Service;

public class Get_By_Id_Branch {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Branch_Service branchService = (Branch_Service)applicationContext.getBean("service");
		
		Branch branch = branchService.getId(110);
		
		if(branch != null) {
			System.out.println("Branch Id: "+branch.getBranchId());
			System.out.println("Branch Name: "+branch.getBranchname());
			System.out.println("Branch Location: "+branch.getBranchLocation());
		}
		else {
			System.out.println("Object not found for this id");
		}
	}
}
