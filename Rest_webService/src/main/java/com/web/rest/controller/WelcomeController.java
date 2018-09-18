package com.web.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.web.rest.beans.Welcome;

@Controller
public class WelcomeController 
{
	@GetMapping("/welcome/user")
	@ResponseBody
	public Welcome welcomeUser(@RequestParam(name="name",required=false, defaultValue="Test User")String name) 
	{
		return new Welcome(name);
	}

}
