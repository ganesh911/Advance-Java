package com.jsp.employee.controller;
import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;
public class InsertEmployeeDetails {
public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(180);
		employee.setName("Virat");
		employee.setJob("Player");
		employee.setSal(11156000.00);
		
	EmployeeService empSer= new EmployeeService();
	Employee emp = 	empSer.insertEmployeeDetails(employee);
	if(emp != null) {
		System.out.println("data saved");
	}
	else {
		System.out.println("Data not saved");
	}
	}
}
