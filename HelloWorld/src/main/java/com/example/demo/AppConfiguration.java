package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppConfiguration {
@RequestMapping("/hello")
public String hello() {
	return "Hello World!";
}
@RequestMapping("/hello-app")
public String hello1() {
	return "Hello World! app";
}
}
