package com.live.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.live.model.Product;

@RestController
public class ProductController {
	List<Product> products = new ArrayList<Product>();
	@GetMapping("/products")
	public List<Product> getProducts(){
		
		products.add(new Product(1001,"SpringBoot"))
		return null;
	}

}
