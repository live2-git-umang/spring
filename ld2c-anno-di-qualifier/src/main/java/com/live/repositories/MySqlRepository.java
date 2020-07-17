
package com.live.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.live.model.Product;

@Repository
public class MySqlRepository implements ProductRepository {

	@Override
	public List<Product> getProducts() {
		System.out.println("MySql Repository");

		List<Product> products = new ArrayList<>();

		Product product = new Product();

		product.setProductId("P11");
		product.setProductId("MySql");

		products.add(product);

		return products;
	}

}
