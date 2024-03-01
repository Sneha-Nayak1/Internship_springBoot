package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class CourseController {
	@RequestMapping("courses")
	public ModelAndView courses(@RequestParam("cname") String ccc) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("cname",ccc);
		mv.setViewName("course");
		return mv;
	}
}
