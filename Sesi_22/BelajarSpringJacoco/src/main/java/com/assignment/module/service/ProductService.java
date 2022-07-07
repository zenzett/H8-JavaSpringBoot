package com.assignment.module.service;

import java.util.List;

import com.assignment.module.model.Product;

public interface ProductService {
	List<Product> findAllProduct();

	Product saveorUpdateProduct(Product product);

	Product findByIdProduct(Integer id);

	void deleteProduct(Integer id);
}
