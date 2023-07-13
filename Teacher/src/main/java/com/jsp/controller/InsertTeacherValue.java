package com.jsp.controller;

import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;

public class InsertTeacherValue {

	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(1002);
		teacher.setName("Mr.Unde");
		teacher.setSal(60000);
		teacher.setEducation("Btech");
		TeacherService teacherService = new TeacherService();
		Teacher	teacher1 =teacherService.insertTeacherValueService(teacher);
		if(teacher1 != null ) {
			System.out.println("Data saved");
		}
		else {
			System.out.println("Data not saved");
		}
		
	}
}
