package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class DeleteTeacher {

	public static void main(String[] args) {
		TeacherService teacherService = new TeacherService();
		Teacher teacher1 = teacherService.deleteTeacherObjectService(1000);
		if(teacher1 != null) {
			System.out.println("Data deleted...........");
		}
		else {
			System.out.println("Data not deleted check your id");
		}
	}
}
