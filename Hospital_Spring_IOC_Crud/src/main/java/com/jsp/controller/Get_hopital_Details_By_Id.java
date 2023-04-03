package com.jsp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

public class Get_hopital_Details_By_Id {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		HospitalService hospitalService = (HospitalService)applicationContext.getBean("hospitalSerive");
	Hospital hospital =	hospitalService.getByIdService(1212);
	if(hospital != null) {
		System.out.println("Hospital regNO: "+hospital.getRegNo());
		System.out.println("Hospital Name: "+hospital.getName());
		System.out.println("Hospital location: "+hospital.getLocation());
		System.out.println("Hospital total doctor: "+hospital.getNoOfDoctor());
		System.out.println("Hospital total patient: "+hospital.getNoOfPatient());	
	}
	else {
		System.out.println("object is't there");
	}
	}
}
