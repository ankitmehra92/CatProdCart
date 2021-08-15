package com.example.cats.entities;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "product_attributes")
public class ProductAttributes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pro_attribute_id")
	private long id;
	
	@Column(name="attribute_value", length=50, nullable=false, unique=false)
	private String attributeValue;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "product_id" ,referencedColumnName = "product_id")
	private Product product;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "attribute_id" ,referencedColumnName = "attribute_id")
	private CategoryAttributes categoryAttributes;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public CategoryAttributes getCategoryAttributes() {
		return categoryAttributes;
	}

	public void setCategoryAttributes(CategoryAttributes categoryAttributes) {
		this.categoryAttributes = categoryAttributes;
	}

}
