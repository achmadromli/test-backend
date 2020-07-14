package com.test.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.test.backend.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
