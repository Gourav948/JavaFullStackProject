package com.spring.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.json.UserProfile;
import com.spring.service.UserCredentialsService;
<<<<<<< HEAD
//import com.spring.entity.PasswordResetEntity;

import com.spring.json.UserCredentials;
=======

>>>>>>> 19a8530d51832b69a554dc34690192b4438c2931


@RestController
@RequestMapping("/app/customer/")
public class UserCredentialsController {
	
	@Autowired
	private UserCredentialsService usercredentialsservice;

		
		@PostMapping(value="/login",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
		public String loginUser(@RequestBody UserProfile usercredentials){
			return usercredentialsservice.autoLogin(usercredentials);
		}
		
		@DeleteMapping(value="/logout",produces=MediaType.APPLICATION_JSON_VALUE)
		public UserProfile logoutUser(@RequestHeader(name="auth-token") String authToken) {
			return usercredentialsservice.autoLogout(authToken);
		
		
	}
		
<<<<<<< HEAD

	
		
		
		
		
		
=======
		private UserCredentialsService userCredentialsService;

		@PostMapping(value="/app/customer", produces=MediaType.APPLICATION_JSON_VALUE, consumes=MediaType.APPLICATION_JSON_VALUE)
		public @ResponseBody UserProfile registerUserProfile(@RequestBody UserProfile userProfile) {
			return userCredentialsService.save(userProfile);
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



>>>>>>> 19a8530d51832b69a554dc34690192b4438c2931
		
		
		
		
		
		
		
		
		
		
		
	

