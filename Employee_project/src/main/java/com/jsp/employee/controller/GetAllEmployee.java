package com.jsp.employee.controller;
import java.util.List;
import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;
public class GetAllEmployee {
public static void main(String[] args) {
	EmployeeService employeeService = new EmployeeService();
	Employee employee = new Employee();
	List<Employee> li = employeeService.getAllEmployee();
	if(li.size()>0) {
	for(Employee employee1 : li) {
		System.out.println("Id:	"+employee1.getId());
		System.out.println("Name: "+employee1.getName());
		System.out.println("Sal: "+employee1.getSal());
		System.out.println("Job: "+employee1.getJob());
		System.out.println("------*---------*---------*-----------*---------*--------");
	}
	}
}
}
