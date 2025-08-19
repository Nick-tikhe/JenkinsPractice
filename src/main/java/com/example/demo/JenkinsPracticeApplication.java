package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeApplication {

	
	public static String helloWorldProgram() {
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracticeApplication.class, args);
		
		System.out.println(helloWorldProgram());
	}

}
