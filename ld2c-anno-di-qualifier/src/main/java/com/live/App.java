package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import com.live.config.AppConfig;
import com.live.repositories.ProductRepository;
import com.live.service.ProductService;


public class App 
{
	public static void main( String[] args )
	{
		//ProductRepository productRepository;

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService productService = context.getBean("productService",ProductService.class);
		productService.getProducts1().forEach(System.out::println);
		productService.getProducts2().forEach(System.out::println);

		
		//implicit Name of the bean
		/*
		 * productRepository = (ProductRepository) context.getBean("oracleRepository");
		 * 
		 * productRepository.getProducts().forEach(System.out::println);
		 */
		context.close();
	}

}