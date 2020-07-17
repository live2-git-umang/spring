package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.live.model.Product;
import com.live.repositories.OracleRepository;
import com.live.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {
	@Value("${domain.name}")
	private String domain;
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

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
