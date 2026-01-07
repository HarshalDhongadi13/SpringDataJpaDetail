package com.spring_data_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring_data_jpa.entity.EmployeeDetails;

@Repository
public interface EmployeeInterface extends JpaRepository<EmployeeDetails, Long> {

	@Query("SELECT u from EmployeeDetails u  JOIN FETCH u.employeeOrders o Where u.designation= :e_name")
//	@Query("SELECT u from EmployeeDetails u")
	public List<EmployeeDetails> findEmployeeDetailsUsingEmployeeName(@Param("e_name") String empName);
}
