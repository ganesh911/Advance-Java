package com.spring.boot.Spring_Boot_Crud.dao;

import java.util.List;
import java.util.Optional;

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
	
	public List<Admin> getAllAdmin(){
		return repository.findAll();
	}
	
	public Admin deleteAdmin(int id) {
		Optional<Admin> optional = repository.findById(id);
		if(optional.isPresent()) {
			repository.delete(optional.get());
		}
		return optional.get();		
	}
	
	public Admin updateAdmin(Admin admin) {
		Optional<Admin> optional = repository.findById(admin.getId());
		if(optional.isPresent()) {
			 return	repository.save(admin);
		}
		return optional.get();
	}
	
	public Admin getById(int id) {
		Optional<Admin> optional = repository.findById(id);
		return optional.get();
	}
}
