package com.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.entity.StudentOrderDetails;
import com.spring_data_jpa.entity.StudentProductDetails;
import com.spring_data_jpa.service.StudentService;

@RestController
@RequestMapping("/demo-api")
public class StudentController {

	@Autowired
	private StudentService studentService;

	// Product related stuff
	@PostMapping("/student-product/insert")
	public StudentProductDetails insertStudentProductDetails(@RequestBody StudentProductDetails studentProductDetails) {
		return studentService.saveProductDetails(studentProductDetails);
	}

	@GetMapping("/student-product/product-list")
	public List<StudentProductDetails> fetchAllProducts() {
		return studentService.fetchAllProducts();
	}

// Order related stuff
	@PostMapping("/student-order/insert")
	public StudentOrderDetails insertStudentOrderDetails(@RequestBody StudentOrderDetails studentOrderDetails) {
		return studentService.insertStudentOrders(studentOrderDetails);
	}

}
