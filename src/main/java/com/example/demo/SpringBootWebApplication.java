package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.controller.UserService;

@SpringBootApplication
public class SpringBootWebApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootWebApplication.class, args);
	}

}
