package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SalaryControllerTest {
	
	@InjectMocks
	SalaryController salaryController;
	
	@Mock
	SalaryService salaryService;
	
	@Mock
	EmployeeService employeeService;
	
	@Test
	public void salaryControllerTest() {
		SalaryInput sal = new SalaryInput();
		sal.setEmployeeId(1L);
		sal.setNewSalary("1000");
		salaryController.salary(sal);
		ResponseEntity response = new ResponseEntity();
		response.setSalary(sal);
		response.setSuccess(true);
		Mockito.when(salaryService.getSalaryForEmployee(sal)).thenReturn(response);
		response.getSuccess();
		response.getEmployee();
	}
	
	@Test
	public void salaryEmployees() {
		salaryController.employees();
		Employee emp = new Employee(1,"rr");
		List<Employee> list =new ArrayList<>();
		Mockito.when(employeeService.getAllEmployees()).thenReturn(list);
	
	}
	
	@Test
	public void updateSalaryTest() {
		SalaryInput sal = new SalaryInput();
		sal.setEmployeeId(1L);
		sal.setNewSalary("1000");
		salaryController.updateSalary(sal);
		ResponseEntity response = new ResponseEntity();
		response.setSalary(sal);
		response.setSuccess(false);
		Mockito.when(salaryService.updateSalary(1L, "1000")).thenReturn(response);

	}
	

}
