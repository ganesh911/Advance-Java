package com.jsp.employee.controller;
import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;

public class DeleteEmployee {

	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = employeeService.deleteEmployee(110);
		if(employee != null) {
			System.out.println("Data deleted");
		}
		else {
			System.out.println("please check your data");
		}
	}
}
