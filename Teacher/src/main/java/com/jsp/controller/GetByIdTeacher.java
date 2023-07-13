package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class GetByIdTeacher {
public static void main(String[] args) {
	TeacherService teacherService = new TeacherService();
	Teacher teacher1 = teacherService.getByIdService(1002);
	if(teacher1 != null) {
		System.out.println("Id: "+teacher1.getId());
		System.out.println("Name: "+teacher1.getName());
		System.out.println("Salary: "+teacher1.getSal());
		System.out.println("Education: "+teacher1.getEducation());
	}
	else {
		System.out.println("Check your id");
	}
	
}
}
