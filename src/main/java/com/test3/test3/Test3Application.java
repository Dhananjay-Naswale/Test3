package com.test3.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test3Application {
	public static void main(String[] args) {
		String name = "mike";
		int x = 100;
		int y = 200;
		double z = 10.3;
		float d =10.33f;
		char c = 'a';
		SpringApplication.run(Test3Application.class, args);
	}

}
