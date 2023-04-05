package com.jsp.mobile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
private int cId ;
private String cName ;
private String email ;
private String password ;
private String address ;


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getcName() {
	return cName;
}
public void setcName(String cName) {
	this.cName = cName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
