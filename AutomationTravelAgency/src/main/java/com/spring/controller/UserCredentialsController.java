package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.UserCredentialsService;
//import com.spring.entity.PasswordResetEntity;
import com.spring.entity.UserCredentialsEntity;
import com.spring.json.UserCredentials;

@RestController
@RequestMapping("/app/customer/")
public class UserCredentialsController {
	
	@Autowired
	private UserCredentialsService usercredentialsservice;

		
		@PostMapping(value="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
		public String loginUser(@RequestBody UserCredentials usercredentials){
			return usercredentialsservice.autoLogin(usercredentials);
		}
		
		@DeleteMapping(value="/logout",produces=MediaType.APPLICATION_JSON_VALUE)
		public UserCredentials logoutUser(@RequestHeader(name="auth-token") String authToken) {
			return usercredentialsservice.autoLogout(authToken);
		
		
	}
		
	/*	
		@PostMapping(value="/changePassword",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
		public UserCredentials changePassword(@RequestBody PasswordResetEntity passwordresetentity){
			UserCredentials value=new UserCredentials();
			boolean result=usercredentialsservice.requestPasswordReset(passwordresetentity.getPassword());
					
			
			
			
			return value;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

