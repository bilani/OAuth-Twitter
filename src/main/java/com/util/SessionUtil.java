package com.util;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;

import com.model.login;

@Component
public class SessionUtil {

	public boolean checkUser (HttpSession session){
		boolean isVerified = false;
		if ((login) session.getAttribute("user")!=null){
			isVerified = true;
		}
	return isVerified;
	}
	
}