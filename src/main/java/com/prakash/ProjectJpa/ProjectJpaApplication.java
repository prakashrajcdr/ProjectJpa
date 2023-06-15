package com.prakash.ProjectJpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.prakash.ProjectJpa.entity.Employee;
import com.prakash.ProjectJpa.service.ServiceImpl;

@SpringBootApplication
public class ProjectJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext config = SpringApplication.run(ProjectJpaApplication.class, args);
		
		ServiceImpl service = config.getBean(ServiceImpl.class);
		
		try {
			Employee employee = new Employee();
			
			employee.setName("Prakash");
			employee.setEmailId("prakash@gmail.com");
			service.addEmployee(employee);
			
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
