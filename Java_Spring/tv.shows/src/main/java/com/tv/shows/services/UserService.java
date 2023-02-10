package com.tv.shows.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.tv.shows.models.LoginUser;
import com.tv.shows.models.User;
import com.tv.shows.repositories.UserRepo;

@Service
public class UserService {
	@Autowired
	private UserRepo userRepo;
	
	public User register(User newUser, BindingResult result) {
		Optional<User> possibleUser = userRepo.findByEmail(newUser.getEmail());
		if(possibleUser.isPresent()) {
			result.rejectValue("email", "Match", "Email is taken!");
			return null;
		}
		
		if(!newUser.getPassword().equals(newUser.getConfirm())){
			result.rejectValue("confirm", "Match", "Passwords must match!");
			return null;
		} 
		
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		return userRepo.save(newUser);
	}
	
	public User login(LoginUser log, BindingResult result) {
		Optional<User> possibleUser = userRepo.findByEmail(log.getEmail());
		
		if(!possibleUser.isPresent() ) {
			result.rejectValue("email", "Invalid", "Invalid credentials.");
			return null;
		} else {
			if(!BCrypt.checkpw(log.getPassword(), possibleUser.get().getPassword())) {
				result.rejectValue("password", "Invalid", "Invalid credentials.");
				return null;
			}
		}
		return possibleUser.get();
	}
	
	public User findById(Long id) {
		Optional<User> possibleUser = userRepo.findById(id);
		if(possibleUser.isPresent()) {
			return possibleUser.get();
		}
		return null;
	}

}
