package com.framgia.project1.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport{
	private int productId;
	private String productName;
	private float price;
	private String productImageFileName;
	private File productImage;
	private String productImageContentType;
	private String description;
	private String type;
	private static String uploadFile="/home/namnguyen/Desktop/upload/";
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	public String getProductImageFileName() {
		return productImageFileName;
	}
	public void setProductImageFileName(String productImageFileName) {
		this.productImageFileName = productImageFileName;
	}
	public File getProductImage() {
		return productImage;
	}
	public void setProductImage(File productImage) {
		this.productImage = productImage;
	}
	public String getProductImageContentType() {
		return productImageContentType;
	}
	public void setProductImageContentType(String productImageContentType) {
		this.productImageContentType = productImageContentType;
	}
	public String execute() throws Exception{
		
        try {
    		File destFile  = new File(uploadFile, productImageFileName);

			FileUtils.copyFile(productImage, destFile);
			return SUCCESS;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	         return ERROR;
		}
		
		
	}
	
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
