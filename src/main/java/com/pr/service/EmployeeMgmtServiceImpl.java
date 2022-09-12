package com.pr.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.pr.document.Employee;
import com.pr.repository.IEmployeeRepo;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepo empRepo;

	@Override
	public String saveEmployee(Employee emp) {
		return "MogoDB Doc is saved with id value:" + empRepo.insert(emp).getId();
	}

	@Override
	public List<Employee> showAllEmployees() {
		return empRepo.findAll();
	}

	@Override
	public String searchEmployeeById(String idVal) {
		Optional<Employee> opt = empRepo.findById(idVal);
		if (opt.isEmpty())
			return "Document is not Found";
		else
			return opt.get().toString();
	}

	@Override
	public String modifyEmployeeById(String idVal, Double newSal) {

		Optional<Employee> opt = empRepo.findById(idVal);
		if (opt.isEmpty())
			return "Documenet not found";
		else {
			Employee emp = opt.get();
			emp.setSalary(newSal);
			empRepo.save(emp);

			return "Docuemnt found and updated";

		}

	}// method

	@Override
	public String removeEmployeeById(String idVal) {
		Optional<Employee> opt = empRepo.findById(idVal);
		if (opt.isEmpty())
			return "Document is not Found";
		else {
			empRepo.deleteById(idVal);
			return "Document is founded and deleted susefully";
		}
	}



}// class
