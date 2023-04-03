package com.jsp.dto;
import javax.persistence.*;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Hospital {
@Id
	private int regNo;
	private String name;
	private String location;
	private int noOfPatient;
	private int noOfDoctor;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfPatient() {
		return noOfPatient;
	}
	public void setNoOfPatient(int noOfPatient) {
		this.noOfPatient = noOfPatient;
	}
	public int getNoOfDoctor() {
		return noOfDoctor;
	}
	public void setNoOfDoctor(int noOfDoctor) {
		this.noOfDoctor = noOfDoctor;
	}
}
