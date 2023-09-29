package com.edu.co.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.co.product.service.ProductServiceI;
import com.edu.ue.model.Product;

@CrossOrigin(origins = "*")
@RestController
public class ProductController {

	@Autowired
	ProductServiceI service;
	
	@GetMapping (value="Product",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Product> getAllProduct(){
		return service.getAllProduct();
	}
	
	
	@PostMapping(value="newProduct",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Product newProduct(@RequestBody Product product) {
		return service.newProduct(product);
		
	}
	
	@PutMapping (value="updateProduct",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Product upProduct(@RequestBody Product product) {
		return service.upProduct(product);
		
		
	}
}
