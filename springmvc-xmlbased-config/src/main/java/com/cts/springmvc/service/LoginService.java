package com.cts.springmvc.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

	public boolean validate(String username,String password) {
		if(username.equals(password))
		return true;
		else
		return false;
	}
}
