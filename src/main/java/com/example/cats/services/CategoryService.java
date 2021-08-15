package com.example.cats.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.cats.Repositories.CategoryRepository;
import com.example.cats.model.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public void saveCategory(Category category)
	{
		com.example.cats.entities.Category category_entity= new com.example.cats.entities.Category();
		category_entity.setCategoryName(category.getName());
		categoryRepository.save(category_entity);
	}
}
