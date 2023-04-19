package com.spring.Hospital_Crud_SpringBoot.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private String name ;
	private String location ;
	private int noOfDoctor ;
	
	public void setId(int id) {
		this.id = id ;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name ;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	public void setNoOfDoctor(int noOfDoctor) {
		this.noOfDoctor = noOfDoctor;
	}
	public int getNoOfDoctor() {
		return noOfDoctor;
	}
	
}
