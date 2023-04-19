package com.spring.Hospital_Crud_SpringBoot.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.Hospital_Crud_SpringBoot.dto.Hospital;
import com.spring.Hospital_Crud_SpringBoot.repository.HospitalRepository;

@Repository
public class HospitalDao {

	@Autowired
	HospitalRepository repository;
	
	public Hospital saveDetails(Hospital hospital) {
		return repository.save(hospital);
	}
	public Hospital updateDetails(Hospital hospital) {
		Optional<Hospital> optional = repository.findById(hospital.getId());
		if(optional != null) {
			repository.save(hospital);
		}
		return optional.get(); 
	}
	public Hospital getById(int id) {
		Optional<Hospital> optional = repository.findById(id);
		return optional.get();	
	}
	public Hospital deleteDetails(int id) {
		Optional<Hospital> optional = repository.findById(id);
		if(optional != null) {
			repository.delete(optional.get());
		}
		return optional.get();
	}
	public List<Hospital> getAllDetails() {
		return repository.findAll();
	}
}
