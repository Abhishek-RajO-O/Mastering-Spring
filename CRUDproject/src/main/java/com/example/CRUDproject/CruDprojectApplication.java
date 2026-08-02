package com.example.CRUDproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CruDprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruDprojectApplication.class, args);
		System.out.println("hello world");
	}

}
