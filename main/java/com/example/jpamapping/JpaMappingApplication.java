package com.example.jpamapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.jpamapping.implementation.StudentDataPersistance;

@EnableTransactionManagement
@SpringBootApplication
public class JpaMappingApplication implements CommandLineRunner {
	@Autowired
	StudentDataPersistance persistance;
	public static void main(String[] args) {
		SpringApplication.run(JpaMappingApplication.class, args);
	}
	
	public void run(String... arg0) throws Exception {
		
		persistance.addData();
		
	}
	

}
