package com.edu.co.product.service;

import java.util.List;

import com.edu.ue.model.Product;

public interface ProductServiceI {

	List<Product> getAllProduct();
	Product newProduct(Product product);
	Product upProduct(Product product);

}
