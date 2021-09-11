package com.vijay.employeemanagementsystem.repository;

import com.vijay.employeemanagementsystem.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
