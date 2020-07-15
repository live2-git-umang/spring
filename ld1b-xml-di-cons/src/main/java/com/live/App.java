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
		//performIOC();
		System.out.println("SPRING XML CONFIG WITH DI Injection Constructor Based");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService productService = context.getBean("productService",ProductService.class);
		productService.getProducts().forEach(System.out::println);
		
		context.close();
	}

}