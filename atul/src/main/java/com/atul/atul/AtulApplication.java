package com.atul.atul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AtulApplication {

	public static void main(String[] args) {
		System.out.println(MyController.getGreeting());
		SpringApplication.run(AtulApplication.class, args);
	}

}
