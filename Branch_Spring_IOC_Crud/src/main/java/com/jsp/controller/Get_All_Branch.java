package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Branch;
import com.jsp.service.Branch_Service;

public class Get_All_Branch {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		
		Branch_Service branchService = (Branch_Service)applicationContext.getBean("service");
		
		List<Branch> list = branchService.getAllService();
		
		if(list.size() > 0) {
			for(Branch branch : list) {
				System.out.println("Branch Id: "+branch.getBranchId());
				System.out.println("Branch Name: "+branch.getBranchname());
				System.out.println("Branch Location: "+branch.getBranchLocation());
				System.out.println("-------------------------------------------");
			}
		}
		else {
			System.out.println("Data is not found for this object");
		}
	}
}
