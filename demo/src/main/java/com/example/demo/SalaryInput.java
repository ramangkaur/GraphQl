package com.example.demo;

import java.math.BigDecimal;

public class SalaryInput {

	private String employeeId;

	private BigDecimal newSalary;

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public BigDecimal getNewSalary() {
		return newSalary;
	}

	public void setNewSalary(BigDecimal newSalary) {
		this.newSalary = newSalary;
	}

}