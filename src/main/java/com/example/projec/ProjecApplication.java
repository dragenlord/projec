package com.example.projec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProjecApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjecApplication.class, args);
	}

}
