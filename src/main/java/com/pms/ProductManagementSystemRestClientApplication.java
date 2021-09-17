package com.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ProductManagementSystemRestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementSystemRestClientApplication.class, args);
	}
	//reg RestTemplate
	@Bean 
   public RestTemplate restTemplate()
	{
		return new RestTemplate();
		
	}

}
