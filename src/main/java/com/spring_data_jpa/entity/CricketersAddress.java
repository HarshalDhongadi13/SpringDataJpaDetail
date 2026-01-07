package com.spring_data_jpa.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricketers_address")
public class CricketersAddress {

	private String city;
	private String state;
	private String country;

	@EmbeddedId
	private CricketersAddressCK id;

	public CricketersAddress() {

	}

}
