package com.prakash.ProjectJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prakash.ProjectJpa.entity.Employee;
import com.prakash.ProjectJpa.repository.EmployeeRepository;

@Service
public class ServiceImpl {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
}
