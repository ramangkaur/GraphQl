package com.example.demo;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import reactor.core.publisher.Mono;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
//import org.springframework.graphql.data.method.annotation.Argument;
//import org.springframework.graphql.data.method.annotation.MutationMapping;
//import org.springframework.graphql.data.method.annotation.QueryMapping;
//import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SalaryController {

	private final EmployeeService employeeService;

	private final SalaryService salaryService;

	public SalaryController(EmployeeService employeeService, SalaryService salaryService) {
		this.employeeService = employeeService;
		this.salaryService = salaryService;
	}

	@QueryMapping
	public List<Employee> employees() {
		return this.employeeService.getAllEmployees();
	}

	@SchemaMapping
	public ResponseEntity salary(SalaryInput employee) {
		return this.salaryService.getSalaryForEmployee(employee);
	}

	@MutationMapping
	public ResponseEntity updateSalary(@Argument("input")SalaryInput salaryInput) {
		String employeeId = salaryInput.getEmployeeId();
		String salary = salaryInput.getNewSalary();
		//System.out.println("emp"+employeeId);
		//System.out.println("ssss"+salary);
		return this.salaryService.updateSalary(employeeId, salary);
	}

}