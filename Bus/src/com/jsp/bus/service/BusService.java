package com.jsp.bus.service;
import java.util.List;

import com.jsp.bus.dto.Bus;
import com.jsp.dao.BusDao;

public class BusService {
	BusDao busDao = new BusDao();
	
	public void createTableService() {
		busDao.createTableBus();
	}
	
	public int insertBusService(Bus bus) {
		return busDao.insertBusValue(bus);
	}
	
	public int updateBusService(Bus bus) {
		return busDao.updateBus(bus);
	}
	
	public int deleteBusService(int id) {
		return busDao.deleteBus(id);
	}
	
	public Bus getByNoService(int id) {
		return busDao.getBusById(id);
	}
	
	public List<Bus> getAllBusService(){
		return busDao.getAllBus();
	}
}
