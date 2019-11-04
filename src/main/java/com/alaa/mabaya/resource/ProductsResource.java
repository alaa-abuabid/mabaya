package com.alaa.mabaya.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alaa.mabaya.model.Product;
import com.alaa.mabaya.repository.ProductRepository;

@RestController
@RequestMapping(value = "/products")
public class ProductsResource {
	
	@Autowired
	ProductRepository productRepository;
	
	@GetMapping(value = "/serve")
	public Product serve(@RequestParam String category){
		Product p= productRepository.adWithCategoryHighestCampaignBid(category);
		if(p==null ) p =productRepository.adWithHighestCampaignBid();
		return p;
	}
	
}
