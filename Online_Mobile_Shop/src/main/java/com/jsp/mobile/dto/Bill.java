package com.jsp.mobile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Bill {
@Id
private int bId ;
private int bAmount ;
private String date ;
@OneToOne
private Admin admin ;
@OneToOne
private Customer customer ;


public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public int getbAmount() {
	return bAmount;
}
public void setbAmount(int bAmount) {
	this.bAmount = bAmount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}


}
