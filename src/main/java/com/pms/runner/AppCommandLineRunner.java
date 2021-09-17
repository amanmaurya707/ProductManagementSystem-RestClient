package com.pms.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.pms.dto.ProductDTO;
@Component
public class AppCommandLineRunner implements CommandLineRunner {   
	@Autowired
	RestTemplate restTemplate;

	@Override
	public void run(String... args) throws Exception {
		/*
		//get For Object
		List productList=restTemplate.getForObject("http://localhost:8080/PMS/allProducts",List.class);
		productList.forEach(obj->System.out.println(obj));
		*/
		/*//get For entity
		System.out.println("##");
		ResponseEntity<List> re=restTemplate.getForEntity("http://localhost:8080/PMS/allProducts",List.class);
		List pList=re.getBody();//get body from re
        HttpStatus status=re.getStatusCode();

		pList.forEach(p->System.out.println(p));
		System.out.println("status:"+status);
		*/
		/*System.out.println("*using exchange methods*");
		ParameterizedTypeReference<List<ProductDTO>> parTypeRef=new ParameterizedTypeReference<List<ProductDTO>>() {};
		ResponseEntity<List<ProductDTO>> re=restTemplate.exchange("http://localhost:8080/PMS/allProducts",HttpMethod.GET,null,parTypeRef);//entity is null for get method //use for put and post method
		List<ProductDTO> pDTOList=re.getBody();
		pDTOList.forEach(p->System.out.println(p));
		*/
		/*
		 //for post
		ProductDTO pdto=new ProductDTO();
		pdto.setProductId(1007L);
		pdto.setProductName("MI Note 11");
		pdto.setManufacturer("Xiomi");
		pdto.setPrice(25000.0);
		String message=restTemplate.postForObject("http://localhost:8080/PMS/product/add", pdto,String.class);
		System.out.println(message);
		*/
		/*
		//for put
		ProductDTO pdto=new ProductDTO();
		pdto.setProductId(1007L);
		pdto.setProductName("MI Note 11");
		pdto.setManufacturer("XIOMI");
		pdto.setPrice(35000.0);
		restTemplate.put("http://localhost:8080/PMS/product/update",pdto);
		*/
		
		//for delete
		//restTemplate.delete("http://localhost:8080/PMS/product/1007");
		System.out.println("success##");
		

	}

}
