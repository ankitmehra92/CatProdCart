package com.example.cats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cats.services.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService service;

	@RequestMapping(path = "/category", method = RequestMethod.POST)
	public void createCategory(@RequestBody com.example.cats.model.Category category) {
		service.saveCategory(category);
	}
}
