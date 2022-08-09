package com.example.demo;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SalaryServiceTest {
	
	@Mock
    SalaryRepository salaryRespository;
	
	@InjectMocks
	SalaryService SalaryService;
	
	@Test
	public void getSalaryForEmployeeTest() {
		SalaryInput sal = new SalaryInput();
		sal.setEmployeeId(1L);
		sal.setNewSalary("1000");
		SalaryService.getSalaryForEmployee(sal);
	}
	
	@Test
	public void updateSalaryTest() {
		SalaryService.updateSalary(1L, "1000");
	}
}

