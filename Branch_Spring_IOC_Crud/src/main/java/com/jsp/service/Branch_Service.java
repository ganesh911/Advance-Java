package com.jsp.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.jsp.dao.Branch_Dao;
import com.jsp.dto.Branch;

@Component("service")
public class Branch_Service {

	@Autowired
	Branch_Dao branchDao;
	
	public Branch insertService(Branch branch) {
		return branchDao.insert(branch);
	}
	
	public Branch updateService(Branch branch) {
		return branchDao.update(branch);
	}
	
	public Branch deleteService(int id) {
		return branchDao.delete(id);
	}
	
	public Branch getId(int id) {
		return branchDao.getId(id);
	}
	
	public List<Branch> getAllService(){
		return branchDao.getAll();
	}
}
