package com.jsp.bidirectional.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Adhar1 {
@Id
	private int uid;
	private String address, dOB;
	@OneToOne(mappedBy = "adhar1")
	private Person1 person1;
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
	public Person1 getPerson1() {
		return person1;
	}
	public void setPerson(Person1 person1) {
		this.person1 = person1;
	}
	
	
}
