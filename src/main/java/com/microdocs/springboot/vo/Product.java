package com.microdocs.springboot.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	@Id
	public String id;

	public int productId;
	public String name;
	public String description;
	public String imageUrl;

	public Product(int productId, String name, String description, String imageUrl) {
		this.name = name;
		this.productId = productId;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	@Override
	public String toString() {
		return "Product{" +
				", productId='" + productId + '\'' +
				", name=" + name +
				", description=" + description +
				", imageUrl=" + imageUrl +
				'}';
	}
}