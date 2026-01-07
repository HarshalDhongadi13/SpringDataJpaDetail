package com.spring_data_jpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.entity.EmployeeDetails;
import com.spring_data_jpa.repository.EmployeeInterface;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeInterface employeeInterface;

	public EmployeeDetails saveEmployee(EmployeeDetails employeeDetails) {

		return employeeInterface.save(employeeDetails);
	}

	public EmployeeDetails getEmployeeById(Long empId) {

		Optional<EmployeeDetails> existingEmployeeDetails = employeeInterface.findById(empId);
		if (existingEmployeeDetails.isPresent()) {
			return existingEmployeeDetails.get();
		}
		return null;
	}

	public List<EmployeeDetails> getEmpDetailsByName(String name) {
		return employeeInterface.findEmployeeDetailsUsingEmployeeName(name);
	}
}
