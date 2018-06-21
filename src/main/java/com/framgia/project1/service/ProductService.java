package com.framgia.project1.service;

import java.util.List;

import com.framgia.project1.model.Product;

public interface ProductService {
	void addProduct(Product product);
	List<Product> findAllProduct();
}
