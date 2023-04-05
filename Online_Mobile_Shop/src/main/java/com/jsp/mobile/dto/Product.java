package com.jsp.mobile.dto;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
@Id
private int pId ;
private String pName ;
private String pType ;
@ManyToMany
private List<Customer> customer;
@ManyToOne
private Admin admin;

public Admin getAdmin() {
	return admin;
}
public void setAdmin(Admin admin) {
	this.admin = admin;
}
public List<Customer> getCustomer() {
	return customer;
}
public void setCustomer(List<Customer> customer) {
	this.customer = customer;
}
public int getpId() {
	return pId;
}
public void setpId(int pId) {
	this.pId = pId;
}
public String getpName() {
	return pName;
}
public void setpName(String pName) {
	this.pName = pName;
}
public String getpType() {
	return pType;
}
public void setpType(String pType) {
	this.pType = pType;
}



}
