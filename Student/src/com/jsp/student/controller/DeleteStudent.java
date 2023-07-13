package com.jsp.student.controller;
import java.util.Scanner;

import com.jsp.student.service.StudentService;
public class DeleteStudent {
public static void main(String[] args) {
	StudentService studentService = new StudentService();
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the roll no delete the student");
	int r = sc.nextInt();
	studentService.deleteStudent(r);
	
}
}
