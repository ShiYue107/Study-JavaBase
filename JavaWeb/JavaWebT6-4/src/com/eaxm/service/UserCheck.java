package com.eaxm.service;

import com.eaxm.data.User;

public class UserCheck {
	public boolean validate(User user) {
		if(user!=null&&user.getName().equals("JSPMVC")) {
			if(user.getPwd().equals("MVC")) {
				return true;
			}
			return false;
		}
		return false;
	}
}
