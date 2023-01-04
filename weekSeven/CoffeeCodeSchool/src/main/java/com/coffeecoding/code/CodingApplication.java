package com.coffeecoding.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.coffeecoding")
public class CodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodingApplication.class, args);
	}

}
