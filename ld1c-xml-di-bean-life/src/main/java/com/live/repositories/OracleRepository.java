package com.live.repositories;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class OracleRepository implements ProductRepository {

	public OracleRepository() {
		System.out.println("OracleRepository Constructor");
	}
	
	public void init() {
		System.out.println("Initialization of Bean");
	}
	
	public void destroy() {
		System.out.println("Destruction of Bean");
	}
	
	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository");
		
		List<Product>  products = new ArrayList<>();
		
		Product product = new Product();
		
		product.setProductId("P01");
		product.setProductId("Oracle");
		
		products.add(product);
		
		return products;
	}

}
