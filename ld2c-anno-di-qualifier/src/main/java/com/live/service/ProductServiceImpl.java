package com.live.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.live.model.Product;
import com.live.repositories.ProductRepository;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	//@Autowired
	//@Qualifier("mySqlRepository")
	private ProductRepository productRepository;
	private ProductRepository productRepository2;

	public ProductServiceImpl(){

		System.out.println("ProductServiceImpl = "+productRepository);
	}
	
	//@Autowired
	public ProductServiceImpl(ProductRepository productRepository) {
		System.out.println("1st ProductServiceImpl" +productRepository);
	}
	
	//@Autowired
	public void setAdditionalProductServiceImpl(ProductRepository productRepository) {
		System.out.println("2nd Additional Method setAdditionalProductServiceImpl" +productRepository);
	}

	@Autowired
	@Qualifier("mySqlRepository")
	public void setProductRepository(ProductRepository productRepository) {
		System.out.println("3rd setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
	}

	@Autowired
	public void setProductRepository(@Qualifier("mySqlRepository") ProductRepository productRepository,@Qualifier("oracleRepository") ProductRepository productRepository2) {
		System.out.println("3rd setProductRepository(ProductRepository productRepository)");
		this.productRepository = productRepository;
		this.productRepository2 = productRepository2;
	}


	@Override
	public List<Product> getProducts1() {
		// TODO Auto-generated method stub
		return productRepository.getProducts();
	}
	
	public List<Product> getProducts2() {
		// TODO Auto-generated method stub
		return productRepository2.getProducts();
	}
}
