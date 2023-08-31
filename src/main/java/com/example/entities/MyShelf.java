package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class MyShelf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shelfId;

	@OneToOne
	@JoinColumn(name = "customerId")
	private CustomerMaster customerId;

	@Column(name = "productId")
	private Long productId;

	private String tranType;
	private Date productExpiryDate;
	private boolean isActive;

	public Long getShelfId() {
		return shelfId;
	}

	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}

	public String getTranType() {
		return tranType;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Date getProductExpiryDate() {
		return productExpiryDate;
	}

	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public CustomerMaster getCustomerId() {
		return customerId;
	}

	public void setCustomerId(CustomerMaster customerId) {
		this.customerId = customerId;
	}
}