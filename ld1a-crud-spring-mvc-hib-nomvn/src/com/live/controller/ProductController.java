package com.live.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
@GetMapping("value=/list")	
	public String getProducts() {
		return "products";
	}
}
