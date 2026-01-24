package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LoginRequest;
import com.example.demo.dto.LoginResponse;
import com.example.demo.service.AuthService;

@RestController
@RequestMapping("/auth")
@CrossOrigin
public class AuthController {
	
	private AuthService authService;
	
	public AuthController(AuthService authService) {
		this.authService = authService;
	}
	
	@PostMapping("/login")
	public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest request){
		
		LoginResponse response = authService.authenticate(request);
		
		if("SUCCESS".equals(response.getStatus())) {
			return ResponseEntity.ok(response);
		}else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
		}
	}
}
