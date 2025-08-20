package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsPracticeApplication {
public static final Logger logger=LoggerFactory.getLogger(JenkinsPracticeApplication.class);
	
	public static  helloWorldProgram() {
		logger.info("1st Hello world program and testing in a logger");
		return "Hello World";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(JenkinsPracticeApplication.class, args);
		logger.info("Application Started 1");
		System.out.println(helloWorldProgram());
	}

}
