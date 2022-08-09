package com.example.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import reactor.core.publisher.Mono;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

	
	@Autowired
	EmployeeRepository employeeRepository;

	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity getSalaryForEmployee(Employee emp) {
		ResponseEntity entity=new ResponseEntity();
		entity.setSuccess(true);
		entity.setEmployee(emp);
		System.out.println("salary="+emp.getSalary());
		return entity;
	}

	//@Secured({ "ROLE_HR" })
	public ResponseEntity updateSalary(Integer employeeId, Integer newSalary) {
		Employee emp1 = new Employee(1,"raman");
		employeeRepository.save(emp1);
		Employee emp = employeeRepository.findById(employeeId).get();
		emp.setSalary(newSalary);
		employeeRepository.save(emp);
		return getSalaryForEmployee(emp);
	}

}
