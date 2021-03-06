package com.live.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.live.model.Product;


//@Component("productRepository") - this one is easy way of writing component
//@Component(value="productRepository")
//implicit component name would OracleRepository

@Component
public class OracleRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		System.out.println("Oracle Repository");
		
		List<Product>  products = new ArrayList<>();
		
		Product product = new Product();
		
		product.setProductId("P01");
		product.setProductName("Oracle");
		
		products.add(product);
		
		return products;
	}
}