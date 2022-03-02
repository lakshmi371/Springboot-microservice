package com.ibs.training.user.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibs.training.user.entity.User;
import com.ibs.training.user.repository.UserRepository;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;


	public User saveUser(User user) {
		return userRepository.save(user);
	}


	public Optional<User> getUser(long userId) {
		return userRepository.findById(userId);
	}

	
}