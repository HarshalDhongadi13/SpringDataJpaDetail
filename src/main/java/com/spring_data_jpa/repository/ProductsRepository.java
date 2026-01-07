package com.spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring_data_jpa.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {

	List<Products> findByBrand(String brand);

	List<Products> findByCategory(String category);

	List<Products> findByBrandAndCategory(String brand, String category);

	List<Products> findByPriceGreaterThan(Double price, Pageable page);

	List<Products> findByPriceLessThan(Double price, Sort sort);

	// Lets learn JpQl query

	@Query("Select u from Products u where u.category =:categoryName ")
	List<Products> findUsingCategory(@Param("categoryName") String category);
}
