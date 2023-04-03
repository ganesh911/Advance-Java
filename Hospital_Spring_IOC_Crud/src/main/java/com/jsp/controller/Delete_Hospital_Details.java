package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

public class Delete_Hospital_Details {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
	HospitalService hospitalService =(HospitalService)applicationContext.getBean("hospitalservice");
	Hospital hospital = hospitalService.deleteHospitalByIdService(2211);
	if(hospital != null) {
		System.out.println("object deleted");
	}
	else {
		System.out.println("object is't there");
	}
	}
}
