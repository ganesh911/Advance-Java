package com.spring.Hospital_Crud_SpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Hospital_Crud_SpringBoot.dto.Hospital;
import com.spring.Hospital_Crud_SpringBoot.service.HospitalService;

@RestController
public class HospitalController {
	@Autowired
	HospitalService hospitalService;
	
	@PostMapping("/hospitals")
	public Hospital save(@RequestBody Hospital hospital) {
		return hospitalService.saveDetailsService(hospital);
	}
	
	@GetMapping("/hospitals/{id}")
	public Hospital getById(@PathVariable int id) {
		return hospitalService.getByIdService(id);
	}
	
	@PutMapping("/hospitals")
	public Hospital update(@RequestBody Hospital hospital) {
		return hospitalService.updateDetailsService(hospital);
	}
	
	@DeleteMapping("/hospitals/{id}")
	public Hospital delete(@PathVariable int id) {
		return hospitalService.deleteDetailsService(id);
	}

	@GetMapping("/hospitals")
	public List<Hospital> getAll(){
		return hospitalService.getAllDetailsService();
	}
}
