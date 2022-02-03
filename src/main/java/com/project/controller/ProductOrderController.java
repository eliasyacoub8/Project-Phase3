package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.ProductOrder;
import com.project.repository.ProductOrderRepository;

@RestController
public class ProductOrderController {
	
	@Autowired
	private ProductOrderRepository productorderrepository;
	
	@PostMapping ("productorders/add")
	public ProductOrder addProductOrder(@RequestBody ProductOrder productorder)
	{
		return productorderrepository.save(productorder);
	}
	
@GetMapping("productorders/productorder/publishedDate")
	
	public List<ProductOrder> getlatestproduct()
	{
		List<ProductOrder> productorderlatest=(List<ProductOrder>) productorderrepository.findlatestpurchase(null);
		return productorderlatest;
	}

}
