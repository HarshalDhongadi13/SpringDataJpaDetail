package com.spring_data_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_data_jpa.entity.Products;
import com.spring_data_jpa.repository.ProductsRepository;
import com.spring_data_jpa.service.ProductsService;

@RestController
@RequestMapping("/demo-api")
public class ProductsController {

	@Autowired
	private ProductsService productsService;

	@Autowired
	private ProductsRepository productsRepository;

	@GetMapping("/get-products")
	public List<Products> fetchAllProducts() {
		return productsService.fetchAllProducts();
	}

	@PostMapping("/get-products-queries")
	public List<Products> fetchAllProductsUsingDerivedQueries(@RequestBody Products product) {
		return productsService.fetchAllProductsUsingDerivedQueries(product);
	}

}
