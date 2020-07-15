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
		performIOC();
		testSingleton();
	}

	private static void performIOC() {
		System.out.println( "Enterprise Application Starter");
		//ProductRepository productRepository = new OracleRepository();
		ProductRepository productRepository = null;

		//Load the spring container
		//spring container uses applicationContext.xml to configure the spring beans
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//access the spring bean from the application for Oracle
		productRepository = (ProductRepository) context.getBean("productRepository");
		productRepository.getProducts().forEach(System.out::println);

		ProductRepository mySqlRepository = null;
		//access the spring bean from the application for MySql
		mySqlRepository = context.getBean("mySqlRepository",ProductRepository.class);
		mySqlRepository.getProducts().forEach(System.out::println);

		//Testing if its a singleton
		System.out.println(productRepository);
		System.out.println(mySqlRepository);

		context.close();
	}

	private static void testSingleton() {

		ProductRepository productRepository = null;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		productRepository = (ProductRepository) context.getBean("productRepository");
		System.out.println(productRepository);

		//if we specify prototype in beans xml then 
		productRepository = (ProductRepository) context.getBean("productRepository");
		System.out.println(productRepository);


	}
}