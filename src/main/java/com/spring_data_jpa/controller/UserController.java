package com.spring_data_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.entity.UserAddress;
import com.spring_data_jpa.entity.UserDetails;
import com.spring_data_jpa.service.AddressService;
import com.spring_data_jpa.service.UserService;

@RestController
@RequestMapping("/demo-api")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;

	@PostMapping("/user")
	public UserDetails addUserDetail(@RequestBody UserDetails userDetails) {
		return userService.insertUserDetails(userDetails);
	}

	@GetMapping("/user/{userID}")
	public UserDetails getUserDetail(@PathVariable(name = "userID") Long id) {
		UserDetails obj = userService.getUserById(id);
		return obj;
	}
	
	@GetMapping("/address/{addressID}")
	public UserAddress getAddressDetail(@PathVariable(name = "addressID") Long id) {
		UserAddress obj = addressService.findUserAddressbyId(id);
		return obj;
	}

}
