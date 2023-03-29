package com.jsp.employee.controller;
import com.jsp.employee.dto.Employee;
import com.jsp.employee.service.EmployeeService;
public class UpdateEmployee {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		Employee employee = new Employee();
		employee.setId(120);
		employee.setName("Rajkumar");
		employee.setSal(400000000.00);
		employee.setJob("Employee");
	Employee emp = employeeService.updateEmployee(employee);
	if(emp != null) {
		System.out.println("data updated ");
	}
	else {
		System.out.println("data not updated");
	}
	}
}
