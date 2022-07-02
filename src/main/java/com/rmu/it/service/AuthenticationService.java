package com.rmu.it.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmu.it.dao.AuthenticationDao;
import com.rmu.it.dto.AuthenDTO;

@Service
public class AuthenticationService {

	
	@Autowired
	AuthenticationDao authenticationDao;
	
	public AuthenDTO anthen(String username, String password) {
		
		try {
			AuthenDTO authen = authenticationDao.authen(username, password);
			
			if(null != authen) {
				return authen;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}
