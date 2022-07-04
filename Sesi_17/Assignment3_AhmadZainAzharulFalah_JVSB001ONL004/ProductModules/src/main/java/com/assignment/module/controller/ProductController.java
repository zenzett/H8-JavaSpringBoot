package com.assignment.module.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

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
		return productService.listAllProduct();
	}

	@CrossOrigin
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> products(@PathVariable Integer id) {
		try {
			Product product = productService.getProduct(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@PostMapping("/products")
	public ResponseEntity<?> products(@RequestBody Product product) {
		productService.saveProduct(product);
		return new ResponseEntity<>("Input data produk telah berhasil.", HttpStatus.OK);
	}

	@CrossOrigin
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
		try {
			Product existProduct = productService.getProduct(id);
			if (existProduct.getId() != id) {
				return new ResponseEntity<>("Produk dengan ID tersebut tidak ada.", HttpStatus.OK);
			}
			product.setId(id);
			productService.saveProduct(product);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@CrossOrigin
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("Hapus data produk telah berhasil.", HttpStatus.OK);
	}
}
