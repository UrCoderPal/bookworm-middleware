package com.example.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class GenreMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long genreId;

	private String genreDesc;

	@Column(name = "languageId")
	private Long languageId;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="genreId")
	private List<ProductMaster> productMaster;

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public List<ProductMaster> getProductMaster() {
		return productMaster;
	}

	public void setProductMaster(List<ProductMaster> productMaster) {
		this.productMaster = productMaster;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public String getGenreDesc() {
		return genreDesc;
	}

	public void setGenreDesc(String genreDesc) {
		this.genreDesc = genreDesc;
	}

	public Long getLanguage() {
		return languageId;
	}

	public void setLanguage(Long language) {
		this.languageId = language;
	}

}
