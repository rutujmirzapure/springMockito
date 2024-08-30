package com.example.spring_mockito.dao;

import com.example.spring_mockito.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
