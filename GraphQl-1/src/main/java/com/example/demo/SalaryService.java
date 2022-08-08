package com.example.demo;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import reactor.core.publisher.Mono;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {


	//@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity getSalaryForEmployee(SalaryInput sal) {
		ResponseEntity entity=new ResponseEntity();
		entity.setSuccess(true);
		entity.setSalary(sal);
		return entity;
	}

	//@Secured({ "ROLE_HR" })
	public ResponseEntity updateSalary(String employeeId, String newSalary) {
    SalaryInput sal =new SalaryInput();
    sal.setEmployeeId(employeeId);
    sal.setNewSalary(newSalary);

	return getSalaryForEmployee(sal);
	}

}
