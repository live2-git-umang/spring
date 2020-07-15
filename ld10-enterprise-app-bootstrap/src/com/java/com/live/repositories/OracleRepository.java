package com.live.repositories;

import java.util.ArrayList;
import java.util.List;

import com.live.model.Product;

public class OracleRepository implements ProductRepository {

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
