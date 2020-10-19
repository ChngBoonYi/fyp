package com.fyppasar.webapp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.fyppasar.webapp.dto.UserRegistrationDto;
import com.fyppasar.webapp.model.User;

public interface UserService extends UserDetailsService {

	User findByEmail(String email);
	
	User save(UserRegistrationDto registration);
	
}
