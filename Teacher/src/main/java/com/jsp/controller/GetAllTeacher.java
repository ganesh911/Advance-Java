package com.jsp.controller;
import java.util.List;
import com.jsp.dto.Teacher;
import com.jsp.service.TeacherService;
public class GetAllTeacher {
public static void main(String[] args) {
	TeacherService teacherService= new TeacherService();
	List<Teacher> list = teacherService.getAllTeacherService();
	if(list.size() > 0) {
		for(Teacher teacher1 : list) {
			System.out.println("Id: "+teacher1.getId());
			System.out.println("Name: "+teacher1.getName());
			System.out.println("Salary: "+teacher1.getSal());
			System.out.println("Education: "+teacher1.getEducation());
			System.out.println("----------------------------------------------");
		}
	}
		else {
			System.out.println("Check your id");
		}
}
}
