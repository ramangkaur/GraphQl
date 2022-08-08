package com.example.demo;

import java.math.BigDecimal;
import java.util.List;

import reactor.core.publisher.Mono;

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

	//@QueryMapping
	public List<Employee> employees() {
		return this.employeeService.getAllEmployees();
	}

	/*@SchemaMapping
	public Mono<BigDecimal> salary(Employee employee) {
		return this.salaryService.getSalaryForEmployee(employee);
	}
*/
	/*@MutationMapping
	public void updateSalary(@Argument("input") SalaryInput salaryInput) {
		String employeeId = salaryInput.getEmployeeId();
		BigDecimal salary = salaryInput.getNewSalary();
		this.salaryService.updateSalary(employeeId, salary);
	}*/

}