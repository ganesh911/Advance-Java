package com.jsp.unidirectional.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adhar {
	@Id
	private int uid;
	private String address, dOB;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	
	
}
