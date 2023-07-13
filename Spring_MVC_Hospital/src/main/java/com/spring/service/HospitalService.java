package com.spring.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.spring.dao.HospitalDao;
import com.spring.dto.Hospital;

@Component
public class HospitalService {

	@Autowired
	HospitalDao hospitalDao;
	
	public Hospital saveService(Hospital hospital) {
		return hospitalDao.save(hospital);
	}
	
	public Hospital updateService(Hospital hospital) {
		return hospitalDao.update(hospital);
	}
	
	public Hospital deleteService(int id) {
		return hospitalDao.delete(id);
	}
	
	public Hospital getIdService(int id) {
		return hospitalDao.getId(id);
	}
	
	public List<Hospital> getAllService(){
		return hospitalDao.getAll();
	}
}
