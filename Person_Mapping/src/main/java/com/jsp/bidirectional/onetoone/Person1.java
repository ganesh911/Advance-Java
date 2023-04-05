package com.jsp.bidirectional.onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
@Entity
public class Person1 {
@Id
private int id;
private String name;
private int age;
@OneToOne
@JoinColumn
private Adhar1 adhar1;



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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Adhar1 getAdhar1() {
	return adhar1;
}
public void setAdhar(Adhar1 adhar1) {
	this.adhar1 = adhar1;
}



}
