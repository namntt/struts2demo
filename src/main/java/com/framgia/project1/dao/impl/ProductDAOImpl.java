package com.framgia.project1.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.framgia.project1.dao.ProductDAO;
import com.framgia.project1.model.Product;

public class ProductDAOImpl extends HibernateDaoSupport{
	
	
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
	}

	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return (List<Product>) getHibernateTemplate().find("from Product");
	}

}
