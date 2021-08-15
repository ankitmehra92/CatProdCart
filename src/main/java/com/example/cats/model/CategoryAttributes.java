package com.example.cats.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CategoryAttributes {

	@JsonProperty("attributename")
	private String attributeName;
	
	@JsonProperty("categoryid")
	private String categoryId;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "CategoryAttributes [attributeName=" + attributeName + ", categoryId=" + categoryId + "]";
	}
	
}
