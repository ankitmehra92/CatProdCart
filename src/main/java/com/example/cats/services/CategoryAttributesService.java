package com.example.cats.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cats.Repositories.CategoryAttributesRepository;
import com.example.cats.Repositories.CategoryRepository;
import com.example.cats.entities.Category;
import com.example.cats.model.CategoryAttributes;

@Service
public class CategoryAttributesService {

	@Autowired
	private CategoryAttributesRepository repository;
	
	@Autowired
	private CategoryRepository catRepository;
	
	public void saveAttribute(CategoryAttributes attribute)
	{	
		Category cat = catRepository.findById(Long.parseLong(attribute.getCategoryId())).get();
		com.example.cats.entities.CategoryAttributes attribute_entity = new com.example.cats.entities.CategoryAttributes();
		attribute_entity.setAttributeName(attribute.getAttributeName());
		attribute_entity.setParentCategory(cat);
		repository.save(attribute_entity);
	}
}
