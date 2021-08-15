package com.example.cats.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cats.Repositories.CategoryAttributesRepository;
import com.example.cats.Repositories.CategoryRepository;
import com.example.cats.Repositories.ProductAttributeRepository;
import com.example.cats.Repositories.ProductRepository;
import com.example.cats.entities.Category;
import com.example.cats.entities.ProductAttributes;
import com.example.cats.model.CategoryAttributes;
import com.example.cats.model.Product;
import com.example.cats.model.ProductAttribute;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;

	@Autowired
	private CategoryRepository catRepository;

	@Autowired
	private CategoryAttributesRepository catAttributeRepository;
	
	@Autowired
	private ProductAttributeRepository productAttributeRepository;

	public void saveProduct(Product product) {
		Category cat = catRepository.findById(Long.parseLong(product.getCategory_id())).get();
		com.example.cats.entities.Product product_entity = new com.example.cats.entities.Product();
		product_entity.setProductName(product.getName());
		product_entity.setParentCategory(cat);
		repository.save(product_entity);
		for (ProductAttribute productAttribute : product.getAttributes()) {
			ProductAttributes productAttributes = new ProductAttributes();
			com.example.cats.entities.CategoryAttributes categoryAttributes = catAttributeRepository.findById(Long.parseLong(productAttribute.getAttributeId())).get();
			productAttributes.setCategoryAttributes(categoryAttributes);
			productAttributes.setProduct(product_entity);
			productAttributes.setAttributeValue(productAttribute.getAttributeValue());
			productAttributeRepository.save(productAttributes);
		}
	}
	
	public com.example.cats.entities.Product getProduct(long id)
	{
		return repository.getById(id);
	}

}
