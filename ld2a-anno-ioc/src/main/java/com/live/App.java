package com.live;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.live.repositories.OracleRepository;
import com.live.repositories.ProductRepository;
import com.live.service.ProductService;
import com.live.service.ProductServiceImpl;

public class App 
{
	public static void main( String[] args )
	{
		ProductRepository productRepository = null;

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//access the spring bean from the application for Oracle
		
		//this would be used with explicit naming of repository
		//productRepository = (ProductRepository) context.getBean("productRepository");
		
		//implicit Name of the bean
		productRepository = (ProductRepository) context.getBean("oracleRepository");
		
		productRepository.getProducts().forEach(System.out::println);
		
		context.close();
	}

}