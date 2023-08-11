package com.tibs.spring.cloud.workshop.usermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.tibs.spring.cloud.workshop")
public class User360ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(User360ServiceApplication.class, args);
	}

}
