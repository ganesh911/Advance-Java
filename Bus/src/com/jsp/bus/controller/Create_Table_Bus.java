package com.jsp.bus.controller;

import com.jsp.bus.service.BusService;

public class Create_Table_Bus {
	
	public static void main(String[] args) {
		BusService busService = new BusService();
		busService.createTableService();
		System.out.println("Table created...............");
	}
}
