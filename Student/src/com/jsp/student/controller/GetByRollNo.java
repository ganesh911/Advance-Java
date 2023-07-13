package com.jsp.student.controller;
import com.jsp.student.service.StudentService;
import java.util.*;
public class GetByRollNo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StudentService studentService= new StudentService();
	System.out.println("Enter the roll no to fetch student");
	int rollNo = sc.nextInt();
	studentService.getByRollNo(rollNo);
	}
}
