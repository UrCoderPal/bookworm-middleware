package com.example.entities;

import java.sql.Date;
import java.util.List;

import org.hibernate.engine.internal.CascadePoint;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ProductMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;

	private String productName;
	private String productEnglishName;

	@OneToOne
	@JoinColumn(name = "typeId")
	private ProductTypeMaster productType;

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private List<InvoiceDetails> invoiceDetails;
	

	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private List<MyShelf> myshelf;


	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="productId")
	private List<RoyaltyCalculation> royalCal;

	@Column(name = "prodBenProductId")
	private Long prodBenProductId;

	@Column(name = "publisherId")
	private Long publisherId;

	@Column(name = "languageId")
	private Long languageId;

	@Column(name = "genreId")
	private Long genreId;

	private double productBasePrice;
	private double productSpCost;
	private double productOfferPrice;

	private Date productOffPriceExpiryDate;

	private String productDescriptionShort;
	private String productDescriptionLong;
	private String productISBN;
	private String productAuthor;
	private boolean isRentable;
	private boolean isLibrary;
	private double rentPerDay;
	private double minRentDays;

	public List<InvoiceDetails> getInvoiceDetails() {
		return invoiceDetails;
	}

	public void setInvoiceDetails(List<InvoiceDetails> invoiceDetails) {
		this.invoiceDetails = invoiceDetails;
	}

	public List<MyShelf> getMyshelf() {
		return myshelf;
	}

	public void setMyshelf(List<MyShelf> myshelf) {
		this.myshelf = myshelf;
	}
	
	public List<RoyaltyCalculation> getRoyalCal() {
		return royalCal;
	}

	public void setRoyalCal(List<RoyaltyCalculation> royalCal) {
		this.royalCal = royalCal;
	}
	public Long getProdBenProductId() {
		return prodBenProductId;
	}

	public void setProdBenProductId(Long prodBenProductId) {
		this.prodBenProductId = prodBenProductId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductEnglishName() {
		return productEnglishName;
	}

	public void setProductEnglishName(String productEnglishName) {
		this.productEnglishName = productEnglishName;
	}

	public ProductTypeMaster getProductType() {
		return productType;
	}

	public void setProductType(ProductTypeMaster productType) {
		this.productType = productType;
	}

	public double getProductBasePrice() {
		return productBasePrice;
	}

	public void setProductBasePrice(double productBasePrice) {
		this.productBasePrice = productBasePrice;
	}

	public double getProductSpCost() {
		return productSpCost;
	}

	public void setProductSpCost(double productSpCost) {
		this.productSpCost = productSpCost;
	}

	public double getProductOfferPrice() {
		return productOfferPrice;
	}

	public void setProductOfferPrice(double productOfferPrice) {
		this.productOfferPrice = productOfferPrice;
	}

	public Date getProductOffPriceExpiryDate() {
		return productOffPriceExpiryDate;
	}

	public void setProductOffPriceExpiryDate(Date productOffPriceExpiryDate) {
		this.productOffPriceExpiryDate = productOffPriceExpiryDate;
	}

	public String getProductDescriptionShort() {
		return productDescriptionShort;
	}

	public void setProductDescriptionShort(String productDescriptionShort) {
		this.productDescriptionShort = productDescriptionShort;
	}

	public String getProductDescriptionLong() {
		return productDescriptionLong;
	}

	public void setProductDescriptionLong(String productDescriptionLong) {
		this.productDescriptionLong = productDescriptionLong;
	}

	public String getProductISBN() {
		return productISBN;
	}

	public void setProductISBN(String productISBN) {
		this.productISBN = productISBN;
	}

	public String getProductAuthor() {
		return productAuthor;
	}

	public void setProductAuthor(String productAuthor) {
		this.productAuthor = productAuthor;
	}

	public Long getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
	}

	public Long getLanguageId() {
		return languageId;
	}

	public void setLanguageId(Long languageId) {
		this.languageId = languageId;
	}

	public Long getGenreId() {
		return genreId;
	}

	public void setGenreId(Long genreId) {
		this.genreId = genreId;
	}

	public boolean isRentable() {
		return isRentable;
	}

	public void setRentable(boolean isRentable) {
		this.isRentable = isRentable;
	}

	public boolean isLibrary() {
		return isLibrary;
	}

	public void setLibrary(boolean isLibrary) {
		this.isLibrary = isLibrary;
	}

	public double getRentPerDay() {
		return rentPerDay;
	}

	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}

	public double getMinRentDays() {
		return minRentDays;
	}

	public void setMinRentDays(double minRentDays) {
		this.minRentDays = minRentDays;
	}

}
