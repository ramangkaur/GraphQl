package com.example.demo;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.save(employee);
	}

	@RequestMapping(value="/update", method=RequestMethod.POST)
	public Employee updateEmployee(@RequestBody Employee employee,@RequestParam Integer id) {
		 return employeeService.updateEmployee(employee, id);
	}
	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String deleteEmployee(@RequestParam Integer id) {
		return employeeService.deleteEmployee(id);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public ReponseEntity getEmployee(@PathVariable Integer id) {
		return employeeService.getEmployee(id);
	}
	
	@RequestMapping(value="/getAll/", method=RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

}
