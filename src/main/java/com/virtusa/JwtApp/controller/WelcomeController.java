package com.virtusa.JwtApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.JwtApp.Entity.AuthRequest;
import com.virtusa.JwtApp.util.JwtUtil;

@RestController
public class WelcomeController {
	
	  @Autowired
	    private JwtUtil jwtUtil;
	    @Autowired
	    private AuthenticationManager authenticationManager;
	
@GetMapping("/")
	public String welcome() {
		return "Welcome to JWT Token Atherization";
	}
	
@PostMapping("/authenticate")
public String generateToken(@RequestBody AuthRequest authRequest) throws Exception {
    try {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
        );
    } catch (Exception ex) {
        throw new Exception("inavalid username/password");
    }
    return jwtUtil.generateToken(authRequest.getUserName());
}

	
}
