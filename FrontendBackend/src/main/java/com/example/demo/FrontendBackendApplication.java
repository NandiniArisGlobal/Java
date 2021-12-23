package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class FrontendBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FrontendBackendApplication.class, args);
	}

	@Autowired
	EmployeeRepository repository;
	
	@Override
	public void run(String... args)throws Exception{
		this.repository.save(new Employee("Nandini","5784","nandini@gmail.com","8217"));
		this.repository.save(new Employee("Sandhya","34","sjnssm3@gmail.com","4273"));
		this.repository.save(new Employee("Madhu","17","madhumitha@gmail.com","657"));
	}
}
