package com.framgia.project1.service.impl;

import java.util.List;

import com.framgia.project1.dao.ProductDAO;
import com.framgia.project1.model.Product;
import com.framgia.project1.service.ProductService;

public class ProductServiceImpl implements ProductService{
	ProductDAO productDAO;
	
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.findAllProduct();
	}

}
