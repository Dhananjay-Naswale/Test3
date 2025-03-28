package com.test3.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test3Application {
	public static void main(String[] args) {
		Strign name = "mike";
		int x = 10;
		int y = 200;
		double z = 10.3;
		boolean isPresent = false;
		SpringApplication.run(Test3Application.class, args);
	}

}
