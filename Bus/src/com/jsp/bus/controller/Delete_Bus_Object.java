            package com.jsp.bus.controller;

import com.jsp.bus.service.BusService;
import java.util.*;
public class Delete_Bus_Object {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BusService busService = new BusService();
		System.out.println("Enter No of the bus to delete");
		int no = sc.nextInt();
		int status = busService.deleteBusService(no);
		if(status>0) {
			System.out.println("Data deleted...........");
		}
		else {
			System.out.println("data not found for this no");
		}
		
	}
}
