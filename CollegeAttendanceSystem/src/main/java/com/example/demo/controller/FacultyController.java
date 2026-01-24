package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FacultyController {
	@GetMapping("/faculty")
	public String facultyPage() {
		return "faculty";
	}
	
	@GetMapping("/admin/faculty")
	public String facultyPage1() {
		return "faculty";
	}
}
