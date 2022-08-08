package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		ReponseEntity response = new  ReponseEntity();
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "raman"));
		 //employeeRepository.findAll();
		return emp;
	}

	public Employee save(Employee employee ) {
		return employeeRepository.save(employee);
	}


	public Employee updateEmployee(Employee employee, Integer id) {

		return employeeRepository.findById(id).map(e -> {
			employee.setName(employee.getName());
			return employeeRepository.save(employee);
		}).orElseGet(() -> {
			employee.setId(id);
			return employeeRepository.save(employee);
		});
	}

	public String deleteEmployee(Integer id) {
		try {
			employeeRepository.deleteById(id);

		}catch(Exception e) {
			return "failure";
		}
		return "Success";
	}

	public ReponseEntity getEmployee(Integer id) {
		ReponseEntity response = new  ReponseEntity();
		try {
			Employee emp = employeeRepository.findById(id).get();
			response.setEmployee(emp);
			response.setStatus(true);
			return response;
		}catch(Exception e) {
			response.setStatus(false);	
			return response;

		}
	}

}