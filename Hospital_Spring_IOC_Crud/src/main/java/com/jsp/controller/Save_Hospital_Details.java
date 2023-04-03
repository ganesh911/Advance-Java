package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

public class Save_Hospital_Details {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		Hospital hospital = (Hospital)applicationContext.getBean("hospital");
		HospitalService hospitalService = (HospitalService)applicationContext.getBean("hospitalService");
		hospital.setRegNo(2212);
		hospital.setName("AIIMS Hospital");
		hospital.setLocation("Ameerpet");
		hospital.setNoOfDoctor(23);
		hospital.setNoOfPatient(12);
	Hospital hospital2 = hospitalService.insertHospitalDetailsService(hospital);
		if(hospital2 != null) {
			System.out.println("Data is saved");
		}
		else {
			System.out.println("data is not saved");
		}
	}
}
