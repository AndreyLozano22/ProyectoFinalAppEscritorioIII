package com.edu.co.product.dao;

import java.util.List;

import com.edu.ue.model.Product;

public interface ProductDaoI {
	
	List<Product> getProduct();
	Product createProduct(Product product);
	Product updateProduct(Product product);

}
