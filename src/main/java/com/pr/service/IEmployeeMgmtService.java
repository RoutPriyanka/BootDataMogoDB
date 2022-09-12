package com.pr.service;

import java.util.List;

import com.pr.document.Employee;

public interface IEmployeeMgmtService {
	
	public String saveEmployee(Employee emp);
	
	public List<Employee>showAllEmployees();
	
	public String searchEmployeeById(String idVal);
	
	public String modifyEmployeeById(String idVal,Double newSal);
	
	public String removeEmployeeById(String idVal);
	

}
