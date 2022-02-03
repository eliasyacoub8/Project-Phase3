package com.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.project.model.Product;
import com.project.repository.ProductRepository;


@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productrepository;
	
	
	@PostMapping ("products/add")
	public Product addProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	
	@DeleteMapping ("products/delete/{productid}")
	public void deleteProduct(@PathVariable int productid)
	{
		productrepository.deleteById(productid);
	}
	
	@PutMapping("products/update/{productid}")
	public Product updateProduct(@RequestBody Product product)
	{
		return productrepository.save(product);
	}
	

	@RequestMapping(value = "products/product/id/{productid}", method = RequestMethod.GET)
	public Optional<Product> getProductId(@PathVariable int productid)
	{
		return productrepository.findById(productid);
	}
	
	@GetMapping("products/product/season/{season}")
	public ResponseEntity<List<Product>> getProductsbySeason(@PathVariable String season) {
		return new ResponseEntity<List<Product>>(productrepository.findBySeason(season), HttpStatus.OK);
	}
	
	@GetMapping("products/product/brand/{brand}")
	public ResponseEntity<List<Product>> getProductsbyBrand(@PathVariable String brand) {
		return new ResponseEntity<List<Product>>(productrepository.findBybrand(brand), HttpStatus.OK);
	}
	
	@GetMapping("products/product/category/{category}")
	public ResponseEntity<List<Product>> getProductsbyCatgeory(@PathVariable String category) {
		return new ResponseEntity<List<Product>>(productrepository.findByCategory(category), HttpStatus.OK);
	}
	@GetMapping("products/product/color/{productcolor}")
	public ResponseEntity<List<Product>> getProductsbyColor(@PathVariable String productcolor) {
		return new ResponseEntity<List<Product>>(productrepository.findByproductcolor(productcolor), HttpStatus.OK);
	}
	
	@GetMapping("products/product/date")
	
	public List<Product> getlatestproducts()
	{
		List<Product> productlatest=(List<Product>) productrepository.findbylatestproduct(null);
		return productlatest;
	}
	
	@GetMapping("products/product/price")
	
	public List<Product> getcheapest()
	{
		List<Product> productlatest=(List<Product>) productrepository.findbycheapest(null);
		return productlatest;
	}
	


}