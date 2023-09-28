package com.edu.co.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.co.product.dao.ProductDaoI;
import com.edu.ue.model.Product;

@Service
public class ProductService implements ProductServiceI{

	@Autowired
	ProductDaoI daoProduct;
	
	@Override
	public List<Product> getAllProduct(){
		return daoProduct.getProduct();
	}
	
	@Override
	public Product newProduct(Product product) {
		return daoProduct.createProduct(product);
	}

	@Override
	public Product upProduct(Product product) {
		// TODO Auto-generated method stub
		return daoProduct.updateProduct(product);
	}


	
}
