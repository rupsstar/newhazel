package com.test.springweb.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.test.springweb.entities.product;
import com.test.springweb.repos.productrepository;

@RestController
public class ProductRestController {
	
	@Autowired
	productrepository repository;
	
	@GetMapping("/employee/")
	public List<product> getProducts() {
		return repository.findAll();
		
	}
	
	@GetMapping("/employee/{id}")
	@Cacheable("hazelcache")
	public product getProduct(@PathVariable("id")int id) {
		return repository.findById(id).get();
	}

}
