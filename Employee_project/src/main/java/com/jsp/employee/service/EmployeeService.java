package com.jsp.employee.service;
import java.util.List;
import com.jsp.employee.dao.EmployeeDao;
import com.jsp.employee.dto.Employee;
public class EmployeeService
{
EmployeeDao empDao = new EmployeeDao();
public Employee insertEmployeeDetails(Employee employee) {
	return empDao.insertEmployeeDetails(employee);
}
public Employee deleteEmployee(int id) {
		 return empDao.deleteEmployee(id);
}
public Employee updateEmployee(Employee employee) {
	return empDao.updateEmployee(employee);
}
public Employee getByEmployeeId(int id) {
	return empDao.getBYEmployeeId(id);
}
 public List<Employee> getAllEmployee(){
	 return empDao.getAllEmployee();
 }
}
