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

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "base_attributes")
public class CategoryAttributes 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "attribute_id")
	private long id;
	
	@ManyToOne(fetch = FetchType.EAGER,optional = false)
	@JoinColumn(name = "category_id" ,referencedColumnName = "category_id")
	private Category parentCategory;
	
	@JsonManagedReference
	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
	@JoinColumn(name = "attribute_id" ,referencedColumnName = "attribute_id")
	private Set<ProductAttributes> ProductAttributes;
	
	@Column(name="attribute_name", length=50, nullable=false, unique=false)
	private String attributeName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public Set<ProductAttributes> getProductAttributes() {
		return ProductAttributes;
	}

	public void setProductAttributes(Set<ProductAttributes> productAttributes) {
		ProductAttributes = productAttributes;
	}

}
