package com.live.service;

import java.util.List;

import com.live.model.Product;
import com.live.repositories.OracleRepository;
import com.live.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepository;
	public ProductServiceImpl(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		ProductRepository productRepository = new OracleRepository();
		return productRepository.getProducts();
	}
}
