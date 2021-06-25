package com.web.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.rest.beans.UserRegisterRequest;
import com.web.rest.beans.UserRegisterResponse;

@Controller
public class UserRegistrationController 
{
	@RequestMapping(method=RequestMethod.POST, value="/register/user")
	@ResponseBody
	public UserRegisterResponse registerUser(@RequestBody UserRegisterRequest userRegistration) 
	{
		System.out,println("inside registerUser()");
		UserRegisterResponse response = new UserRegisterResponse();
		response.setAge(userRegistration.getAge());
		response.setFullName(userRegistration.getFullName());
		response.setUserName(userRegistration.getUserName());
		response.setResponse("susscess");
		response.setRegNumber(123);
		return response;
	}

}
