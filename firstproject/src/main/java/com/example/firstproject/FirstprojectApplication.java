package com.example.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class FirstprojectApplication {

	@GetMapping("/hi")
	public static void main(String[] args) {
		SpringApplication.run(FirstprojectApplication.class, args);
	}

}
