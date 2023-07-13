package com.jsp.student.dto;
public class Student
{
	private int rollNo;
	private String name, phone, address;
	
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public String getPhone() {
		return phone;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	
}
