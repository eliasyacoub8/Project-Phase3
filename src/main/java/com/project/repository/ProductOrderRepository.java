package com.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.model.ProductOrder;

public interface ProductOrderRepository extends JpaRepository<ProductOrder,Integer>{
	
	
	
	@Query("SELECT q FROM ProductOrder q ORDER BY publishedDate DESC")
	List<ProductOrder> findlatestpurchase(Date publishedDate);
	
	
}
