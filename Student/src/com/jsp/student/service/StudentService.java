package com.jsp.student.service;
import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;
public class StudentService {
	StudentDao studentDao = new StudentDao();
	public void createStudentTable() {
		studentDao.createTableStudent();
	}
	
	public void insertValueStudent(Student student) {
		studentDao.insertValueStudent(student);
	}
	
	public void getByRollNo(int rollNo) {
		studentDao.getByRollNo(rollNo);
	}
	
	public void updateStudent(String name, String phone, String address, int rollno) {
		studentDao.updateStudent(name, phone, address, rollno);
	}
	
	public void deleteStudent(int roll) {
		studentDao.deleteStudent(roll);
	}
}
