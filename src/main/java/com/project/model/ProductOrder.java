package com.project.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.transaction.annotation.EnableTransactionManagement;


@Entity
@Table(name = "productorder")
@EnableTransactionManagement
public class ProductOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productorderID")
	private int productorderid;	
	
      
	@Column(name = "published_date")
    private Date publishedDate;

	@Column(name = "product_id")
    private int productId;
	
	
	
	@Column(name = "user_id")
    private int userId;

	

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductorderid() {
			return productorderid;
		}

		public void setProductorderid(int productorderid) {
			this.productorderid = productorderid;
		}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	

		
}
