package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.beans.StudentBean;
import com.project.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;

	@GetMapping("/")
	public String startPage() {
		return "redirect:/home";
	}
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@PostMapping("/home/startTest")
	public String submitStudentInfo(StudentBean studentBean, Model model) {
		studentBean.setAccess_time(System.currentTimeMillis());
		
		homeService.submitStudentInfo(studentBean);
		model.addAttribute("student_id", studentBean.getStudent_id());
		
		return "test/missions";
	}
}
