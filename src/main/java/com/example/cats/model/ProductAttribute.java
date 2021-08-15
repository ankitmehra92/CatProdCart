package com.example.cats.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductAttribute {

	@JsonProperty("attributeid")
	private String attributeId;
	
	@JsonProperty("attributename")
	private String attributeName;
	
	@JsonProperty("attributevalue")
	private String attributeValue;

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	
	public String getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(String attributeId) {
		this.attributeId = attributeId;
	}

	@Override
	public String toString() {
		return "ProductAttribute [attributeName=" + attributeName + ", attributeValue=" + attributeValue + "]";
	}

}
