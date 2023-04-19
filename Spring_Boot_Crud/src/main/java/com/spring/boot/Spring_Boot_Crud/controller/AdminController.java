package com.spring.boot.Spring_Boot_Crud.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Spring_Boot_Crud.dto.Admin;
import com.spring.boot.Spring_Boot_Crud.service.AdminService;

@RestController
public class AdminController {

		@Autowired
		AdminService adminService;
		
		@PostMapping("/admins")
		public Admin saveAdmin(@RequestBody Admin admin) {
			return adminService.saveService(admin);
		}
		
		@GetMapping("/admins/{id}")
		public Admin getById(@PathVariable	int id) {
			return adminService.getByIdAdminService(id);
		}
		
		@DeleteMapping("/admins/{id}")
		public Admin delete(@PathVariable int id) {
			return adminService.deleteAdminService(id);
		}
		
		@GetMapping("/admins")
		public List<Admin> getAll(){
			return adminService.getAllAdminService();
		}
		
		@PutMapping("/admins")
		public Admin update(@RequestBody Admin admin) {
			return adminService.updateAdminService(admin);
		}
	
}

