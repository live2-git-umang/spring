package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.live.model.Product;
import com.live.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	public ProductServiceImpl(){

		System.out.println("ProductServiceImpl = "+productRepository);
	}
	
	@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("1st ProductServiceImpl" +productRepository);
	}
	
	@Autowired
	public void setAdditionalProductServiceImpl(ProductRepository productRepository) {
		System.out.println("2nd Additional Method setAdditionalProductServiceImpl" +productRepository);
	}

	//@Autowired
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("3rd setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}

	/*
	 * { System.out.println("Generic");
	 * 
	 * }
	 * 
	 * static { //this is executed first System.out.println("Static ");
	 * 
	 * }
	 */

	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}
}
