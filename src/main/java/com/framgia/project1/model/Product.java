package com.framgia.project1.model;

import java.io.Serializable;

public class Product implements Serializable{
	private Integer id;
	private String name;
	private Integer price;
	private String image;
	private String description;
	private String type;

	public Product() {
	}

	public Product(String name, Integer price, String image, String description, String type) {
		this.name = name;
		this.price = price;
		this.image = image;
		this.description = description;
		this.type = type;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
