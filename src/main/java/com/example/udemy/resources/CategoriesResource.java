package com.example.udemy.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.udemy.service.CategoriesService;

@RestController
@RequestMapping(value="/categories")
public class CategoriesResource {
	
	@Autowired
	private CategoriesService service;
	
	@GetMapping("{/id}")
	public void find(@PathVariable Integer id) {
		service.buscar(id);
		
		
	}

}
