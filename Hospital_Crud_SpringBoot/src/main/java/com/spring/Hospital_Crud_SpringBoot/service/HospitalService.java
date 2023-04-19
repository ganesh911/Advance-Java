package com.spring.Hospital_Crud_SpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Hospital_Crud_SpringBoot.dao.HospitalDao;
import com.spring.Hospital_Crud_SpringBoot.dto.Hospital;

@Service
public class HospitalService {
	@Autowired
	HospitalDao hospitalDao;
	public Hospital saveDetailsService(Hospital hospital) {
		return hospitalDao.saveDetails(hospital);
	}
	public Hospital updateDetailsService(Hospital hospital) {
		return hospitalDao.updateDetails(hospital);
	}
	public Hospital getByIdService(int id) {
		return hospitalDao.getById(id);
	}
	public Hospital deleteDetailsService(int id) {
		return hospitalDao.deleteDetails(id);
	}
	public List<Hospital> getAllDetailsService(){
		return hospitalDao.getAllDetails();
	}
	
}
