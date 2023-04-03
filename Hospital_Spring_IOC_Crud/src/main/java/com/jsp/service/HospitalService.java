package com.jsp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;
@Component
public class HospitalService {
	@Autowired
	HospitalDao dao;
	
	public Hospital insertHospitalDetailsService(Hospital hospital) {
		return dao.insertHospitalDetails(hospital);
	}
	
	public Hospital updateHospitalDetailsService(Hospital hospital) {
		return dao.updateHospitalDetails(hospital);
	}
	
	public Hospital deleteHospitalByIdService(int id) {
		return dao.deleteHospitalById(id);
	}
	
	public Hospital getByIdService(int id) {
		return dao.getById(id);
	}
	
	public List<Hospital> getAllService(){
		return dao.getAll();
	}
}
