package com.prakash.ProjectJpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakash.ProjectJpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
