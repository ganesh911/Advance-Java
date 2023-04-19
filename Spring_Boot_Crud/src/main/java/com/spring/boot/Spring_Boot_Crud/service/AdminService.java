package com.spring.boot.Spring_Boot_Crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Spring_Boot_Crud.dao.AdminDao;
import com.spring.boot.Spring_Boot_Crud.dto.Admin;

@Service
public class AdminService {

	@Autowired
	AdminDao adminDao;

	public Admin saveService(Admin admin) {
		return adminDao.saveAdmin(admin);
	}
	
	public List<Admin> getAllAdminService(){
		return adminDao.getAllAdmin();
	}
	
	public Admin deleteAdminService(int id) {
		return adminDao.deleteAdmin(id);
	}
	
	public Admin updateAdminService(Admin admin) {
		return adminDao.updateAdmin(admin);
	}
	
	public Admin getByIdAdminService(int id) {
		return adminDao.getById(id);	
	}
}
