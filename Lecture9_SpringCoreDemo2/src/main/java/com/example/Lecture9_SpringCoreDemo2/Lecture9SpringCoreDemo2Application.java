package com.example.Lecture9_SpringCoreDemo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Lecture9SpringCoreDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lecture9SpringCoreDemo2Application.class, args);
	}
	@Bean
	public UserService getUser(){
		return new UserService();
	}
}
