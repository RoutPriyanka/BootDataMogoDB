package com.pr.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.pr.document.Employee;
import com.pr.service.IEmployeeMgmtService;
@Component
public class MongoRepositoryTestRunner implements CommandLineRunner {
	
	@Autowired
	private IEmployeeMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		
//		======Save all Documents======
//		Employee emp = new Employee();
//		emp.setEno(105);emp.setEname("suresh");emp.setEadd("Odiasha");emp.setSalary(10000.0);emp.setIsVaccinated(false);
//		emp.setEno(104);emp.setEname("raja");emp.setEadd("hyd");emp.setSalary(90000.0);emp.setIsVaccinated(true);
//		System.out.println(service.saveEmployee(emp));
		
		//=========list all Employees=======
		service.showAllEmployees().forEach(System.out::println);
		
		//========findById() --method call======
//		System.out.println(service.searchEmployeeById("631077aa076011086b8c888e"));
		
		//====Updating the Document=====
		//System.out.println(service.modifyEmployeeById("631077aa076011086b8c888e",27000.0));
		
		//======deleteById======
		System.out.println(service.removeEmployeeById("630db5b2f192932302e4445a"));

	}

}
