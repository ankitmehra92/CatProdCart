package com.example.cats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.cats.entities.Product;
import com.example.cats.services.CategoryService;
import com.example.cats.services.ProductService;

@RestController
public class ProductController 
{
	@Autowired
	private ProductService service;

	@RequestMapping(path = "/product", method = RequestMethod.POST)
	public void createProduct(@RequestBody com.example.cats.model.Product product) {
		service.saveProduct(product);
	}
	
	@RequestMapping(path = "/product/{id}", method = RequestMethod.GET)
	public ResponseEntity<Product> getProductById(@PathVariable("id") int productid)
	{
		Product prod = service.getProduct(productid);
		return new ResponseEntity<Product>(prod, HttpStatus.OK);
	}
}
