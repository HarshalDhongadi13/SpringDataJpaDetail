package com.spring_data_jpa.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "student_order_details")
@Setter
@Getter
public class StudentOrderDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "orders_products", joinColumns = @JoinColumn(name = "student_order_id"), inverseJoinColumns = @JoinColumn(name = "student_product_id"))
	private List<StudentProductDetails> studentProductDetails;

//	public Long getOrderId() {
//		return orderId;
//	}
//
//	public void setOrderId(Long orderId) {
//		this.orderId = orderId;
//	}
//
//	public List<StudentProductDetails> getStudentProductDetails() {
//		return studentProductDetails;
//	}
//
//	public void setStudentProductDetails(List<StudentProductDetails> studentProductDetails) {
//		this.studentProductDetails = studentProductDetails;
//	}

}
