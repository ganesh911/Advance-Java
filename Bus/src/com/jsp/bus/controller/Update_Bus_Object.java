package com.jsp.bus.controller;
import com.jsp.bus.dto.Bus;
import com.jsp.bus.service.BusService;
public class Update_Bus_Object {

	public static void main(String[] args) {
		BusService busService = new BusService();
		Bus bus = new Bus();
		bus.setNo(100);
		bus.setRoute("begumpet_to_balkampet");
		bus.setNoOfPass(67);
		bus.setTime(10);
		int status = busService.updateBusService(bus);
		if(status >0 ) {
			System.out.println("Data update successfully..........");
		}
		else {
			System.out.println("Something wrong wtih data");
		}
	}
}
