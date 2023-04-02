package com.jsp.service;

import java.util.List;

import com.jsp.dao.HospitalDao;
import com.jsp.dto.Hospital;

public class HospitalService {

	HospitalDao hospitalDao = new HospitalDao();
	
	public Hospital insertHospitalDetailsService(Hospital hospital) {
		return hospitalDao.insertHospitalDetails(hospital);
	}
	
	public Hospital updateHospitalDetailsService(Hospital hospital) {
		return hospitalDao.updateHospitalDetails(hospital);
	}
	
	public Hospital deleteHospitalByIdService(int id) {
		return hospitalDao.deleteHospitalById(id);
	}
	
	public Hospital getByIdService(int id) {
		return hospitalDao.getById(id);
	}
	
	public List<Hospital> getAllService(){
		return hospitalDao.getAll();
	}
}
