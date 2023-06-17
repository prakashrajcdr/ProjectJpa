package com.prakash.ProjectJpa;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prakash.ProjectJpa.entity.Employee;
import com.prakash.ProjectJpa.service.ServiceImpl;

@SpringBootApplication
public class ProjectJpaApplication {

	@Autowired
	private ServiceImpl serviceImpl;

	public static void main(String[] args) {

		SpringApplication.run(ProjectJpaApplication.class, args);

	}

	@PostConstruct
	public void addEmployee() {

		try {
			Employee employee = new Employee();

			employee.setName("Prakash");
			employee.setEmailId("prakash@gmail.com");
			serviceImpl.addEmployee(employee);

		} catch(Exception e) {
			System.out.println(e);
		}

	}

}
