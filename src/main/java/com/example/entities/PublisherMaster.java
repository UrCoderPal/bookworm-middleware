package com.example.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class PublisherMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long publisherId;
    
    private String publisherName;
    
    private String publisherContactNo;
    
    @OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name="publisherId")
    private List<ProductMaster> productMaster;

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public List<ProductMaster> getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(List<ProductMaster> productMaster) {
		this.productMaster = productMaster;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}

	public String getPublisherContactNo() {
		return publisherContactNo;
	}

	public void setPublisherContactNo(String publisherContactNo) {
		this.publisherContactNo = publisherContactNo;
	}
    
    // Getter and setter methods
    
}