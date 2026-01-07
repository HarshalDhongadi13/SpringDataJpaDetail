package com.spring_data_jpa.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.entity.StudentOrderDetails;
import com.spring_data_jpa.entity.StudentProductDetails;
import com.spring_data_jpa.repository.StudentOrderRepository;
import com.spring_data_jpa.repository.StudentProductRepository;

@Service
public class StudentService {

	@Autowired
	private StudentOrderRepository studentOrderRepository;

	@Autowired
	private StudentProductRepository studentProductRepository;

	// product related stuff
	public StudentProductDetails saveProductDetails(StudentProductDetails obj) {
		return studentProductRepository.save(obj);
	}

	public StudentProductDetails getProductDetails(Long productId) {
		return studentProductRepository.findById(productId).orElse(null);
	}

	// student orders realted stuff
	public StudentOrderDetails insertStudentOrders(StudentOrderDetails obj) {

		List<StudentProductDetails> managedProducts = obj.getStudentProductDetails().stream()
				.map(product -> getProductDetails(product.getProductId())).collect(Collectors.toList());
		if (managedProducts.isEmpty())
			return studentOrderRepository.save(obj);
		obj.setStudentProductDetails(managedProducts);
		return studentOrderRepository.save(obj);
	}

	public List<StudentProductDetails> fetchAllProducts() {
		// TODO Auto-generated method stub
		return studentProductRepository.findAll();
	}

}
