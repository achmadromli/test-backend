package com.test.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.backend.entities.Employee;
import com.test.backend.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployee(@PathVariable Long id) {
		return employeeRepository.getOne(id);
	}
	
	@DeleteMapping("/employee/{id}")
	public boolean deleteEmployee(@PathVariable Long id) {
		employeeRepository.deleteById(id);
		return true;
	}
	
	@PostMapping("/employee")
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
}
