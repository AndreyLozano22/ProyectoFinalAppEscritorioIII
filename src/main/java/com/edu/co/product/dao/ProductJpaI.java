package com.edu.co.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.model.Product;

public interface ProductJpaI extends JpaRepository<Product, Integer>{

	//Product saveAll(int productId);

}
