package com.spring_data_jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring_data_jpa.entity.Products;
import com.spring_data_jpa.repository.ProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private ProductsRepository productsRepository;

	public List<Products> fetchAllProducts() {
		return productsRepository.findAll();
	}

	public List<Products> fetchAllProductsUsingDerivedQueries(Products value) {

//		return productsRepository.findByBrand(value.getBrand());
//		return productsRepository.findByCategory(value.getCategory());
//		return productsRepository.findByBrandAndCategory(value.getBrand(), value.getCategory());

//		Pageable pageable = PageRequest.of(0, 2);
//		return productsRepository.findByPriceGreaterThan(value.getPrice(), pageable);
//		Sort sort = Sort.by(Sort.Order.asc("brand"), Sort.Order.desc("category"));
//		return productsRepository.findByPriceLessThan(value.getPrice(), sort);

		return productsRepository.findUsingCategory(value.getCategory());

	}
}