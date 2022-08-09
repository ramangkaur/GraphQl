package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmployeeControllerTest {

	@InjectMocks
	EmployeeController employeeController;
	
	@Mock
	EmployeeService employeeService;
	
	@Test
	public void createEmployeeTest() {
		Employee emp = new Employee(1,"rr");
		employeeController.createEmployee(emp);
		Mockito.when(employeeService.save(emp)).thenReturn(emp);
	}
	
	@Test
	public void updateEmployeeTest() {
		Employee emp = new Employee(1,"rr");
		emp.getName();
		employeeController.updateEmployee(emp,emp.getId());
		Mockito.when(employeeService.updateEmployee(emp,emp.getId())).thenReturn(emp);
	}
	
	@Test
	public void deleteEmployeeTest() {
		employeeController.deleteEmployee(1);
		Mockito.when(employeeService.deleteEmployee(1)).thenReturn("success");
	}
	
	@Test
	public void getEmployeeTest() {
		ReponseEntity response = new ReponseEntity();
		Employee emp = new Employee(1,"rr");
		response.setEmployee(emp);
		response.getEmployee();
		response.isStatus();
		employeeController.getEmployee(1);
		Mockito.when(employeeService.getEmployee(1)).thenReturn(response);
	}
	
	@Test
	public void GetAllEmployeeTest() {
		Employee emp = new Employee(1,"rr");
		List<Employee> list =new ArrayList<>();
		employeeController.getAllEmployees();
		Mockito.when(employeeService.getAllEmployees()).thenReturn(list);
	}
}
