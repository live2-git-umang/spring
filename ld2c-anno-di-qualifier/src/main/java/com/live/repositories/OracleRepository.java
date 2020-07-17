package com.live.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.live.model.Product;


//@Component("productRepository") - this one is easy way of writing component
//@Component(value="productRepository")
//implicit component name would OracleRepository

//@Component
@Repository
@Scope("prototype")

public class OracleRepository implements ProductRepository {
	
	public OracleRepository() {
		System.out.println("public OracleRepository");
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