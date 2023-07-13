package com.jsp.bus.dto;

public class Bus {
	private int No;
	private String route;
	private int noOfPass;
	private int time;
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public int getNoOfPass() {
		return noOfPass;
	}
	public void setNoOfPass(int noOfPass) {
		this.noOfPass = noOfPass;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}

}
