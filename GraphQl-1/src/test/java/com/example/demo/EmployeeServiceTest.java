package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class EmployeeServiceTest {
	
	@InjectMocks
	EmployeeService employeeService;
	
	@Mock
	EmployeeRepository employeeRepository;
	
	@Test
	public void getAllEmployeeTest() {
		employeeService.getAllEmployees();
		Employee emp = new Employee(1,"raman");
		List<Employee> list = new ArrayList<>();
		list.add(emp);
		Mockito.when(employeeRepository.findAll()).thenReturn(list);
	}
	
	@Test
	public void updateEmployeeTest() {
		Employee emp = new Employee(1,"raman");
		employeeService.updateEmployee(emp, 1);
		Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
	}

	@Test
	public void deleteEmployeeTest() {
		employeeService.deleteEmployee(1);
		//Mockito.when(employeeRepository.deleteById(1)).thenReturn(null);
	}
	
	@Test
	public void deleteEmployeeExceptionTest() {
		employeeService.deleteEmployee(null);
		Mockito.when(employeeService.deleteEmployee(null)).thenThrow(new NullPointerException());
	}
	
	@Test
	public void saveEmployeeTest() {
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("raman");
		employeeService.save(emp);
		Mockito.when(employeeRepository.save(emp)).thenReturn(emp);
	}
	
	@Test
	public void getEmployeeTest() {
		Employee emp = new Employee(1,"raman");
		Optional<Employee> opt = Optional.of(emp);
		Mockito.when(employeeRepository.findById(1)).thenReturn(opt);
		employeeService.getEmployee(1);
	}
	
	@Test
	public void getEmployeeExceptionTest() {
		try {
		Employee emp = new Employee(1,"raman");
		Mockito.when(employeeRepository.findById(1)).thenThrow(new NullPointerException());
		employeeService.getEmployee(1);
		}catch(Exception e) {}
	}
}
