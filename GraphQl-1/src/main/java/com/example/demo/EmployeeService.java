package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author r.g.kaur
 *
 */
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		ReponseEntity response = new  ReponseEntity();
		Employee emp = new Employee(1, "raman");
	    employeeRepository.save(emp);
		return employeeRepository.findAll();
		 
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

	/**
	 * @param id
	 * @return
	 */
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