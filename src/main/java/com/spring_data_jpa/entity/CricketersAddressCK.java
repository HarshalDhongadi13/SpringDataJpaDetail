package com.spring_data_jpa.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class CricketersAddressCK {

	private String street;
	private String pincode;

}
