package com.spring_data_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "cricketers_detail", uniqueConstraints = { @UniqueConstraint(columnNames = "cricketerName"),
		@UniqueConstraint(columnNames = { "phone", "address" }) })
public class CricDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cricketerName;
	private String phone;
	private String address;
}
