package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	@GetMapping("")
	
	public Student getStudent() {
		return new Student("Sneha", "Nayak");
	}
	
	@GetMapping("/r")
	public List<Student> getStud(){
		List<Student> s=new ArrayList<Student>();
		s.add(new Student("sneha","nayak"));
		s.add(new Student("fre","dew"));
		s.add(new Student("dew","r4e"));
		s.add(new Student("de","rear4"));
		return s;
	}
	
	
	@GetMapping("{first}/{last}")
	
	public Student get(@PathVariable("first") String f1, @PathVariable ("last") String last) {
		return new Student(f1,last);
	}

	@GetMapping("/st")
	public Student param(@RequestParam(name="fname") String fname, @RequestParam(name="lname") String lname) {
		return new Student(fname,lname);
	}
}
