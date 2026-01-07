package com.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_data_jpa.entity.UserAddress;

public interface AddressRepository extends JpaRepository<UserAddress, Long> {

}
