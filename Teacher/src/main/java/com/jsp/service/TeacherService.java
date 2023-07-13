package com.jsp.service;

import java.util.List;

import com.jsp.dao.TeacherDao;
import com.jsp.dto.Teacher;

public class TeacherService {
TeacherDao teacherDao = new TeacherDao();

public Teacher insertTeacherValueService(Teacher teacher) {
	return teacherDao.insertTeacherValue(teacher);
}

public Teacher updateTeacherValueService(Teacher teacher) {
	return teacherDao.UpdateTeacherValue(teacher);
}
public Teacher deleteTeacherObjectService(int id) {
	return teacherDao.deleteTeacherObject(id);
}

public Teacher getByIdService(int id) {
	return teacherDao.getById(id);
}

public List<Teacher> getAllTeacherService(){
	return teacherDao.getAllTeacher();
}
}
