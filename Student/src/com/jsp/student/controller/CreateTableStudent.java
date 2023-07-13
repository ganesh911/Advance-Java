package com.jsp.student.controller;
import com.jsp.student.service.StudentService;
public class CreateTableStudent {

	public static void main(String[] args) {
	StudentService personService = new StudentService();
			personService.createStudentTable();
	}
}
