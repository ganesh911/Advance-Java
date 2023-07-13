package com.spring.dto;
import javax.persistence.Entity;

import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Hospital {
	@Id
	private int id ;
	private String name ;
	private String website ;
	private String rating ;
	private long phone ;
	
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
}
