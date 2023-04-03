package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

public class Update_Hospital_Details {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		Hospital hospital = (Hospital)applicationContext.getBean("hospital");
		hospital.setRegNo(2121);
		hospital.setLocation("Punjagutta");
		hospital.setName("Dental Hospital");
		hospital.setNoOfDoctor(2);
		hospital.setNoOfPatient(12);
		HospitalService hospitalService = (HospitalService)applicationContext.getBean("hospitalService");
		Hospital hospital2 = hospitalService.updateHospitalDetailsService(hospital);
		if(hospital != null) {
			System.out.println("Data is updated");
		}
		else {
			System.out.println("Error in updatation");
		}
	}
}
