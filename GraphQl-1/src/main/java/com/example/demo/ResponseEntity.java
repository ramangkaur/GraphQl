package com.example.demo;

public class ResponseEntity {
	
	private Boolean success;
	private Employee employee;
	private SalaryInput salaryObj;
	
	public SalaryInput getSalary() {
		return salaryObj;
	}
	public void setSalary(SalaryInput salary) {
		this.salaryObj = salaryObj;
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
