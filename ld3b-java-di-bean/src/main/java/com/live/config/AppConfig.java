package com.live.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.live.repositories.OracleRepository;
import com.live.repositories.ProductRepository;
import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;

@Configuration
//@ComponentScan("com.live")
public class AppConfig {

	//<bean id="productRepository" class="com.live.repositories.OracleRepository" />
	@Bean
	public ProductRepository productRepository() {

		return new OracleRepository();
	}

	@Bean
	public ProductService productService() {
		return new ProductServiceImpl(productRepository());
	}

}