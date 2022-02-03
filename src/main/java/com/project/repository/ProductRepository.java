package com.project.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.model.*;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	List<Product> findBySeason(String season);
	List<Product> findBybrand(String brand);
	List<Product> findByCategory(String category);
	List<Product> findByproductcolor(String productcolor);
	
	@Query("SELECT p FROM Product p ORDER BY date DESC")
	List<Product> findbylatestproduct(Date date);
	
	@Query("SELECT p FROM Product p ORDER BY price ASC")
	List<Product> findbycheapest(String price);
}
