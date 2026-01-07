package com.spring_data_jpa.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.entity.UserAddress;
import com.spring_data_jpa.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;

	public UserAddress findUserAddressbyId(Long id) {
		Optional<UserAddress> existingUserAddress = addressRepository.findById(id);
		if (existingUserAddress.isPresent()) {
			return existingUserAddress.get();
		}
		return null;
	}
}
