package com.anudip.sb.controller;

import java.util.Date;

import javax.servlet.ServletException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.anudip.sb.entity.User;
import com.anudip.sb.service.UserService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public String validate(@RequestBody User user) throws ServletException{
		String jwtToken = "";
		
		if(user.getUserName() == null || user.getPassword() == null) {
			throw new ServletException("Please fill username & password");
		}
		
		String userName = user.getUserName();
		String password = user.getPassword();
		user = userService.loginU(userName, password);
		
		if(user == null) {
			throw new ServletException("User not found ");
		}
		
		jwtToken = Jwts.builder().setSubject(userName).claim("roles", "user")
				.setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256, "secretkey").compact();
		return jwtToken;
	}

}
