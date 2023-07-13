package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class UpdateTeacher {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(1001);
		teacher.setName("Mr.Vivek");
		teacher.setEducation("MTech");
		teacher.setSal(800000);
		TeacherService teacherService = new TeacherService();
		Teacher teacher1 = teacherService.updateTeacherValueService(teacher);
		if(teacher1 != null) {
			System.out.println("Data updated....");
		}
		else {
			System.out.println("Kindly check the primary key");
		}
	}
}
