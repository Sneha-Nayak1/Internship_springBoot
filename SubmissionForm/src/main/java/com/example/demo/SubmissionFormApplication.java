package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SubmissionFormApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(SubmissionFormApplication.class, args);
	}

}
// extends SpringBootServletInitializer
//@Override
//protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
//	return app.sources(SubmissionFormApplication.class)
//}