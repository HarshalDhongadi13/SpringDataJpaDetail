package com.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_data_jpa.entity.StudentProductDetails;

@Repository
public interface StudentProductRepository extends JpaRepository<StudentProductDetails, Long>{

}
