package com.example.demo;

public class ResponseEntity {
	
	private Boolean success;
	private Employee employee;
	private SalaryInput salary;
	
	public SalaryInput getSalary() {
		return salary;
	}
	public void setSalary(SalaryInput salary) {
		this.salary = salary;
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