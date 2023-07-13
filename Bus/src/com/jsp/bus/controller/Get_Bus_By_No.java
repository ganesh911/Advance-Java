package com.jsp.bus.controller;
import java.util.Scanner;

import com.jsp.bus.dto.Bus;
import com.jsp.bus.service.*;
public class Get_Bus_By_No {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BusService busService = new BusService();
	System.out.println("Enter No of the bus to get details");
	int no = sc.nextInt();
	Bus bus = busService.getByNoService(no);
	if(bus != null) {
		System.out.println("Bus No: "+bus.getNo());
		System.out.println("Bus Route: "+bus.getRoute());
		System.out.println("Bus time: "+bus.getTime());
		System.out.println("Bus No of passengers: "+bus.getNoOfPass());
	}
}
}
