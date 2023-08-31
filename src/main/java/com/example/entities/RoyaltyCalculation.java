package com.example.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class RoyaltyCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long roycalId;
    
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "ben_id")
    private BeneficiaryMaster beneficiary;

    @Column(name = "invoiceId")
    private Long invoiceId;
    
    @Column(name = "productId")
    private Long productId;
    
	private int qty;
	private String tranType;
	private double salePrice;
	private double basePrice;
	private double royaltyOnBasePrice;
    private Date roycalTrandate;
    
    public long getRoycalId() {
		return roycalId;
	}
	public void setRoycalId(long roycalId) {
		this.roycalId = roycalId;
	}

	public BeneficiaryMaster getBeneficiary() {
		return beneficiary;
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
	public void setBeneficiary(BeneficiaryMaster beneficiary) {
		this.beneficiary = beneficiary;
	}
	public Date getRoycalTrandate() {
		return roycalTrandate;
	}
	public void setRoycalTrandate(Date roycalTrandate) {
		this.roycalTrandate = roycalTrandate;
	}
	
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public double getRoyaltyOnBasePrice() {
		return royaltyOnBasePrice;
	}
	public void setRoyaltyOnBasePrice(double royaltyOnBasePrice) {
		this.royaltyOnBasePrice = royaltyOnBasePrice;
	}
    
    // Getter and setter methods
}