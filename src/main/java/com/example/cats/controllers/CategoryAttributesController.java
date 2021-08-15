package com.example.cats.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cats.model.CategoryAttributes;
import com.example.cats.services.CategoryAttributesService;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class CategoryAttributesController {
	
	@Autowired
	private CategoryAttributesService service;
	
	@RequestMapping(path = "/attributes", method = RequestMethod.POST)
	public void saveAttributes(@RequestBody List<CategoryAttributes> attributes)
	{
		for (CategoryAttributes categoryAttributes : attributes) {
			service.saveAttribute(categoryAttributes);
		}
	}
	
}

