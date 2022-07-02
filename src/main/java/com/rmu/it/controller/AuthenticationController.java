package com.rmu.it.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rmu.it.dto.AuthenDTO;
import com.rmu.it.service.AuthenticationService;

@RestController
@RequestMapping("/v1/authen")
public class AuthenticationController {

	@Autowired
	AuthenticationService authenticationService;
	
	
	@GetMapping("/login")
	public AuthenDTO login(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(name = "username") String username, @RequestParam(name = "password") String password){
		
		return authenticationService.anthen(username, password);
	}
	
}
