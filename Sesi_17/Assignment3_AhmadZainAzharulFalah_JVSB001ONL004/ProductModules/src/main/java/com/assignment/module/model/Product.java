package com.assignment.module.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
	private int id;
	private String namaProduct;
	private Long hargaBeli;
	private Long hargaJual;

	public Product() {

	}

	public Product(int id, String namaProduct, Long hargaBeli, Long hargaJual) {
		this.id = id;
		this.namaProduct = namaProduct;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNamaProduct() {
		return namaProduct;
	}

	public void setNamaProduct(String namaProduct) {
		this.namaProduct = namaProduct;
	}

	public Long getHargaBeli() {
		return hargaBeli;
	}

	public void setHargaBeli(Long hargaBeli) {
		this.hargaBeli = hargaBeli;
	}

	public Long getHargaJual() {
		return hargaJual;
	}

	public void setHargaJual(Long hargaJual) {
		this.hargaJual = hargaJual;
	}
}
