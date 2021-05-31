package com.cts.junit4.service;

import com.cts.junit4.dto.User;

public class LoginService {

	public boolean validateUser(User user) {
		if(user.getUsername().equals(user.getPassword()))
			return true;
		return false;
	}
	
	public void arithmeticCalculation() {
		int c=5/0;
	}
}
