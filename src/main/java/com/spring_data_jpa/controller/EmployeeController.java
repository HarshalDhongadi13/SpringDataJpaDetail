package com.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.entity.EmployeeDetails;
import com.spring_data_jpa.service.EmployeeService;

@RestController
@RequestMapping("/demo-api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/employee")
	public EmployeeDetails addEmployeeDetail(@RequestBody EmployeeDetails employeeDetails) {
		return employeeService.saveEmployee(employeeDetails);
	}

	@GetMapping("/employee/{userID}")
	public EmployeeDetails getEmployeeDetail(@PathVariable(name = "userID") Long id) {
		EmployeeDetails obj = employeeService.getEmployeeById(id);
		return obj;
	}

	@GetMapping("/employee-name/{userName}")
	public List<EmployeeDetails> getEmpDetailsByName(@PathVariable(name = "userName") String name) {
		return employeeService.getEmpDetailsByName(name);
	}

}
