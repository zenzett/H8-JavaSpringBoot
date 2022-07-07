package com.assignment.module.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.module.model.Product;
import com.assignment.module.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

	@Autowired
	ProductService productService;

	@CrossOrigin
	@GetMapping("/products")
	public List<Product> list() {
		return productService.findAllProduct();
	}

	@CrossOrigin
	@GetMapping("products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {
		try {
			Product product = productService.findByIdProduct(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PostMapping("/products")
	public void products(@RequestBody Product product) {
		productService.saveorUpdateProduct(product);
	}

	@CrossOrigin
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
		try {
			Product existProduct = productService.findByIdProduct(id);
			if (existProduct.getId() != id) {
				return new ResponseEntity<>("ID Product tidak ada", HttpStatus.OK);
			}
			product.setId(id);
			productService.saveorUpdateProduct(product);
			return new ResponseEntity<>("Data berhasil diubah", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("Berhasil menghapus data", HttpStatus.OK);
	}
}
