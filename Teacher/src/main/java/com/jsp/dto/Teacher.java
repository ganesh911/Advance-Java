package com.jsp.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher {
@Id
	private int id;
	private String name;
	private double sal;
	private String education;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
}
