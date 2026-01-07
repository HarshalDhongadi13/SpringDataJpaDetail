package com.spring_data_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring_data_jpa.entity.StudentOrderDetails;

@Repository
public interface StudentOrderRepository extends JpaRepository<StudentOrderDetails, Long>{

}
