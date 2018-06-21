package com.framgia.project1.action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.framgia.project1.model.Product;
import com.framgia.project1.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ProductAction extends ActionSupport implements ModelDriven{
	Product product=new Product();
	List<Product> listProduct=new ArrayList<Product>();
	
	ProductService productService;
	//DI via Spring
		public void setProductService(ProductService productService) {
			this.productService = productService;
		}
	public Object getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	public List<Product> getListProduct() {
		return listProduct;
	}
	public void setListProduct(List<Product> listProduct) {
		this.listProduct = listProduct;
	}
	
	public String listProduct() throws Exception{
		listProduct=productService.findAllProduct();
		return SUCCESS;
	}
	
	
	
	
	
}
