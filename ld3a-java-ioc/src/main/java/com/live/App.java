package com.live;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.live.config.AppConfig;
import com.live.repositories.ProductRepository;


public class App 
{
	public static void main( String[] args )
	{
		ProductRepository productRepository;

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		//implicit Name of the bean
		productRepository = (ProductRepository) context.getBean("oracleRepository");
		
		productRepository.getProducts().forEach(System.out::println);
		
		context.close();
	}

}