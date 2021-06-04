package com.cts.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.springmvc.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/")
	public String showIndexPage() {
		return "index";
	}
	@RequestMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loginProcess(@RequestParam("user")String username,@RequestParam("password")String password) {
		return loginService.validate(username,password)?"success":"login";
		
	}
}
