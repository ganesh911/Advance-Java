package com.jsp.bus.controller;
import java.util.List;
import com.jsp.bus.dto.Bus;
import com.jsp.bus.service.BusService;
public class Get_All_Bus_Object {
public static void main(String[] args) {
	BusService busService = new BusService();
	List<Bus> list = busService.getAllBusService();
	if(list.size() >0) {
		for(Bus bus : list) {
			System.out.println("Bus No: "+bus.getNo());
			System.out.println("Bus Route: "+bus.getRoute());
			System.out.println("Bus time: "+bus.getTime());
			System.out.println("Bus No of passengers: "+bus.getNoOfPass());
			System.out.println("----------------------------------------------------------------------");
		}
	}
}
}
