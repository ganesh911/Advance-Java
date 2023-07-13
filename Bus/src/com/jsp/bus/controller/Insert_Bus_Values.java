package com.jsp.bus.controller;

import com.jsp.bus.dto.Bus;
import com.jsp.bus.service.BusService;

public class Insert_Bus_Values {
 public static void main(String[] args) {
	BusService busService = new BusService();
	Bus bus = new Bus();
	bus.setNo(200);
	bus.setRoute("a_to_b");
	bus.setNoOfPass(30);
	bus.setTime(5);
	 int status = busService.insertBusService(bus);
	 if(status>0) {
		 System.out.println("Data insert successfully..............");
	 }
	 else {
		 System.out.println("Something went wrong");
	 }
}
}
