package com.assignment.module.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.module.model.Product;
import com.assignment.module.repository.ProductRepository;
import com.assignment.module.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product saveorUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product findByIdProduct(Integer id) {
		Product product = productRepository.findById(id).orElse(new Product());
		return product;
	}

	@Override
	public void deleteProduct(Integer id) {
		Product product = productRepository.findById(id).orElse(new Product());
		productRepository.delete(product);
	}

}
