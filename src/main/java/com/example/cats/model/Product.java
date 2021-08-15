package com.example.cats.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

	@JsonProperty("name")
	private String Name;
	
	@JsonProperty("categoryid")
	private String category_id;
	
	@Override
	public String toString() {
		return "Product [Name=" + Name + ", category_id=" + category_id + ", attributes=" + attributes.toString() + "]";
	}

	@JsonProperty("productattributes")
	private List<ProductAttribute> attributes;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCategory_id() {
		return category_id;
	}

	public void setCategory_id(String category_id) {
		this.category_id = category_id;
	}

	public List<ProductAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ProductAttribute> attributes) {
		this.attributes = attributes;
	}
	
}
