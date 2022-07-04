package com.assignment.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assignment.module.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
