package com.spring_data_jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.entity.UserAddress;
import com.spring_data_jpa.entity.UserDetails;
import com.spring_data_jpa.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails insertUserDetails(UserDetails userDetails) {
		return userRepository.save(userDetails);
	}

	public UserDetails getUserById(Long id) {
		Optional<UserDetails> existingUser = userRepository.findById(id);
		if (existingUser.isPresent()) {
			return existingUser.get();
		}
		return null;
	}

	public UserAddress getAddressById(Long id) {
		
		return null;
	}

}
