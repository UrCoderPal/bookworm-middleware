package com.example.entities;

import java.sql.Date;
import com.example.entities.CustomerMaster;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MyShelf {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long shelfId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private CustomerMaster customerId;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private ProductMaster product;

	private String tranType;
	private Date productExpiryDate;
	public Long getShelfId() {
		return shelfId;
	}
	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}
	public CustomerMaster getCustomerId() {
		return customerId;
	}
	public void setCustomerId(CustomerMaster customerId) {
		this.customerId = customerId;
	}
	public ProductMaster getProduct() {
		return product;
	}
	public void setProduct(ProductMaster product) {
		this.product = product;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
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
	private boolean isActive;
}