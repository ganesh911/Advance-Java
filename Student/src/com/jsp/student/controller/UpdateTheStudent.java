package com.jsp.student.controller;
import java.util.*;
import com.jsp.student.*;
import com.jsp.student.dto.Student;
import com.jsp.student.service.StudentService;
public class UpdateTheStudent {
	
public static void main(String[] args) {
	Student student = new Student();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the RollNo to update");
	int r = sc.nextInt();
	System.out.println("Enter the new name");
	String nam= sc.next();
	System.out.println("Enter the new phone");
	String ph= sc.next();;
	System.out.println("Enter the new address");
	String add= sc.next();
	StudentService studentService = new StudentService();
	studentService.updateStudent(nam, ph, add, r);
}
}
