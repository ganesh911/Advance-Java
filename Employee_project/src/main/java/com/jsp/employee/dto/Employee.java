package com.jsp.employee.dto;
import javax.persistence.*;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private double sal; 
	private String job;
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
	public String getJob() {
		return job;
	}public void setJob(String job) {
		this.job = job;
	}
}
