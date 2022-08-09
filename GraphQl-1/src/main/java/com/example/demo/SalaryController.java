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
	public ResponseEntity salaryObj(Employee emp) {
		return this.salaryService.getSalaryForEmployee(emp);
	}

	@MutationMapping
	public ResponseEntity updateSalary(@Argument("input") SalaryInput salaryInput) {
		Integer employeeId = salaryInput.getEmployeeId();
		Integer salary = salaryInput.getNewSalary();
		return this.salaryService.updateSalary(employeeId, salary);
	}

}