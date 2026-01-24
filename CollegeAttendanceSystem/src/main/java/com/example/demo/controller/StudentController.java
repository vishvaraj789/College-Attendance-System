package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/student")
    public String studentPage() {
        return "student";
    }
    
    @GetMapping("/admin/students")
    public String studentPage1() {
        return "student";
    }
}
