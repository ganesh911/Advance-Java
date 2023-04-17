package com.spring.boot.Spring_Boot_Crud.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring.boot.Spring_Boot_Crud.dto.Admin;
import com.spring.boot.Spring_Boot_Crud.repository.AdminRepository;

@Repository      
public class AdminDao {

	@Autowired
	AdminRepository repository;
	
	public Admin saveAdmin(Admin admin) {
		return repository.save(admin);
	}
	
	public List<Admin> geAll(){
		return repository.findAll();
	}
	
	
}
