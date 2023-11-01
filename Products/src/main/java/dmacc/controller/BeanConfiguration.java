package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.Bean.Product;

@Configuration
public class BeanConfiguration {
	@Bean
	public dmacc.Bean.Product Product() {
		Product bean = new Product( );
		return bean;
	}

}