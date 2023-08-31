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
import jakarta.persistence.OneToOne;

@Entity
public class LanguageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long languageId;
    
    private String languageDesc;
    
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="languageId")
    private List<GenreMaster> genreMaster;
    
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name="languageId")
    private List<ProductMaster> productMaster;
    

	public List<ProductMaster> getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(List<ProductMaster> productMaster) {
		this.productMaster = productMaster;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public List<GenreMaster> getGenreMaster() {
		return genreMaster;
	}

	public void setGenreMaster(List<GenreMaster> genreMaster) {
		this.genreMaster = genreMaster;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public String getLanguageDesc() {
		return languageDesc;
	}

	public void setLanguageDesc(String languageDesc) {
		this.languageDesc = languageDesc;
	}

	public ProductTypeMaster getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeMaster productType) {
		this.productType = productType;
	}
    
    // Getter and setter methods
    
}