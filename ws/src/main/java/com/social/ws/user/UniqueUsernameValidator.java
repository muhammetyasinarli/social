package com.social.ws.user;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {

	@Autowired
	UserRepository userrepository;
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		
		User user = userrepository.findByUsername(username);
		return user == null;
		
	}

}
