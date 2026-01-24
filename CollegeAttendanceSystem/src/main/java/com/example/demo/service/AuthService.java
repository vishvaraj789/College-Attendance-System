package com.example.demo.service;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
	public LoginResponse authenticate(LoginRequest request) {
		if(request.getUsername().equals("admin")
				&& request.getPassword().equals("admin123")
				&& request.getRole().equals("ADMIN")) {
			return new LoginResponse("SUCCESS", "Login successful", "ADMIN");
		}
		
		if(request.getUsername().equals("faculty")
				&& request.getPassword().equals("faculty123")
				&& request.getRole().equals("FACULTY")) {
			return new LoginResponse("SUCCESS", "Login successful", "FACULTY");
		}
		
		if(request.getUsername().equals("student")
				&& request.getPassword().equals("student123")
				&& request.getRole().equals("STUDENT")) {
			return new LoginResponse("SUCCESS", "Login successful", "STUDENT");
		}
		
		 return new LoginResponse("FAILURE", "Invalid credentials", null);
	}
}
