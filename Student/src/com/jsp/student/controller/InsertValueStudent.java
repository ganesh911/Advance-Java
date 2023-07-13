package com.jsp.student.controller;
import java.util.Scanner;

import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;
public class InsertValueStudent {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		System.out.println("Enter the roll no");
		int r = sc.nextInt();
		System.out.println("Enter the name");
		String n = sc.next();
		System.out.println("Enter the phone");
		String p = sc.next();
		System.out.println("Enter th address");
		String ad = sc.next();
		Student student = new Student();
		student.setRollNo(r);
		student.setName(n);
		student.setPhone(p);
		student.setAddress(ad);
		StudentService studentService = new StudentService();
		studentService.insertValueStudent(student);
}	

}
