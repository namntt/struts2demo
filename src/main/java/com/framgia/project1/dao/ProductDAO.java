package com.framgia.project1.dao;

import java.util.List;

import com.framgia.project1.model.Product;

public interface ProductDAO {
	void addProduct(Product product);
	List<Product> findAllProduct();
}
