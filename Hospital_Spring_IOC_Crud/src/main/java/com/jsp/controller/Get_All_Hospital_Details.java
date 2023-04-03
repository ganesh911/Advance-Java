package com.jsp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.Myconfig;
import com.jsp.dto.Hospital;
import com.jsp.service.HospitalService;

public class Get_All_Hospital_Details {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Myconfig.class);
		HospitalService hospitalService = (HospitalService)applicationContext.getBean("hospitalService");
		List<Hospital> list = hospitalService.getAllService();
		if(list.size() > 0) {
			for(Hospital hospital: list) {
			System.out.println("Hospital regNO: "+hospital.getRegNo());
			System.out.println("Hospital Name: "+hospital.getName());
			System.out.println("Hospital location: "+hospital.getLocation());
			System.out.println("Hospital total doctor: "+hospital.getNoOfDoctor());
			System.out.println("Hospital total patient: "+hospital.getNoOfPatient());	
			System.out.println("--------------------------------------------------------");
			}
		}
		else {
			System.out.println("there is no objects");
		}
	}
}
