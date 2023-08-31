package com.example.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class InvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invDtlId;

	@Column(name = "invoiceId")
	private Long invoiceId;
	@Column(name = "productId")
	private Long productId;

	private int quantity;
	private double basePrice;
	private String tranType;
	private int rentNoOfDays;

	public Long getInvDtlId() {
		return invDtlId;
	}

	public void setInvDtlId(Long invDtlId) {
		this.invDtlId = invDtlId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public String getTranType() {
		return tranType;
	}

	public Long getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setTranType(String tranType) {
		this.tranType = tranType;
	}

	public int getRentNoOfDays() {
		return rentNoOfDays;
	}

	public void setRentNoOfDays(int rentNoOfDays) {
		this.rentNoOfDays = rentNoOfDays;
	}

	// Getter and setter methods

}