package com.test.backend;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.backend.entities.Employee;
import com.test.backend.other.Gender;
import com.test.backend.repositories.EmployeeRepository;

@SpringBootApplication
public class TestBackendApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(new Employee("Senin", new Date(), new Long(1), new Long(1), Gender.MALE, false));
		employeeRepository.save(new Employee("Selasa", new Date(), new Long(2), new Long(2), Gender.MALE, false));
		employeeRepository.save(new Employee("Rabu", new Date(), new Long(3), new Long(3), Gender.FEMALE, false));
		
	}

}
