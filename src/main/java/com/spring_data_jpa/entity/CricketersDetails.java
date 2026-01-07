package com.spring_data_jpa.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cricketers_details")
public class CricketersDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String phone;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumns({ @JoinColumn(name = "address_street", referencedColumnName = "street"),
			@JoinColumn(name = "address_pincode", referencedColumnName = "pincode") })
	private CricketersAddress cricketersAddress;

	public CricketersDetails() {

	}

}
