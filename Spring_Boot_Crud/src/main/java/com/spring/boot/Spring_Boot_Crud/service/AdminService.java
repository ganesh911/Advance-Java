package com.spring.boot.Spring_Boot_Crud.service;

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
}
