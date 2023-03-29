package com.jsp.employee.controller;
import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;
public class GetByEmployeeId {
	public static void main(String[] args) {
		EmployeeService empser = new EmployeeService();
		Employee employee = empser.getByEmployeeId(100);
		 if(employee != null) {
				System.out.println("Id:"+employee.getId());
				System.out.println("Name:"+employee.getName());
				System.out.println("Salary:"+employee.getSal());
				System.out.println("Job:"+employee.getJob());
			 }
		 else {
			 System.out.println("Please check the id");
		 }
	}
}
