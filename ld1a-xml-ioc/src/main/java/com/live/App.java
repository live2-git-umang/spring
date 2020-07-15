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
        System.out.println( "Enterprise Application Starter");
        //ProductRepository productRepository = new OracleRepository();
        ProductRepository productRepository = null;
        
        //Load the spring container
        //spring container uses applicationContext.xml to configure the spring beans
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //access the spring bean from the application for Oracle
        productRepository = (ProductRepository) context.getBean("productRepository");
        productRepository.getProducts().forEach(System.out::println);
        
        //access the spring bean from the application for MySql
        productRepository = (ProductRepository) context.getBean("productRepository1");
        productRepository.getProducts().forEach(System.out::println);
        
        
        context.close();
    }
}