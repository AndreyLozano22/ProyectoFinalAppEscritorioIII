package com.edu.co.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.model.Product;

@Repository
public class ProductDao implements ProductDaoI{
	
	@Autowired
	ProductJpaI myProduct;
	
	@Override
	public List<Product> getProduct() {
		return myProduct.findAll();
	}

	@Override
	public Product createProduct(Product product){
		return myProduct.save(product);
}

	@Override
	public Product updateProduct(Product productId) {
		return myProduct.save(productId);
		
	}
	
}