package com.project.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name = "product")
@EnableTransactionManagement
public class Product {
@Id
@Column(name = "Product_ID")
private int productid;



@Column(name = "ProductName")
private String productname;

@Column(name = "Season")
private String season ;

@Column(name = "Brand")
private String brand ;

@Column(name = "Category")
private String category;

@Column(name = "Price")
private float price;

@Column(name = "ProductColor")
private String productcolor;

@Column(name = "Createddate")
private Date date;

@Column(name = "Discount")
private int discount;

@Column(name = "Quantity")
private int quantity;



public int getProductid() {
	return productid;
}

public void setProductid(int productid) {
	this.productid = productid;
}

public String getProductname() {
	return productname;
}

public void setProductname(String productname) {
	this.productname = productname;
}

public String getSeason() {
	return season;
}

public void setSeason(String season) {
	this.season = season;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public float getPrice() {
	return price;
}

public void setPrice(float price) {
	this.price = price;
}

public String getProductcolor() {
	return productcolor;
}

public void setProductcolor(String productcolor) {
	this.productcolor = productcolor;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public int getDiscount() {
	return discount;
}

public void setDiscount(int discount) {
	this.discount = discount;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}

@OneToMany(targetEntity = ProductOrder.class, cascade = CascadeType.ALL)
private Set<ProductOrder> productorders;

}
