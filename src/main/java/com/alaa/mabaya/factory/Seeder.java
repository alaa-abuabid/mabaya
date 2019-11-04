package com.alaa.mabaya.factory;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alaa.mabaya.model.Product;
import com.alaa.mabaya.repository.ProductRepository;

@Component
public class Seeder {

	@Autowired
	ProductRepository productRepository;
	
	@PostConstruct
	public void seed() {
		if(productRepository.count()==0) { 
			List<String> categories = new ArrayList<String>();
			categories.add("category0");
			categories.add("category1");
			categories.add("category2");
			categories.add("category3");
			categories.add("category4");
			for(int i =0 ;i<10; i++) {
				int rand =(int) (Math.random() * 5);
				int rand2 =(int) (Math.random() * 5);
				Product product = new Product("product"+i,(rand+rand2)*100.0,categories.get(rand),rand2);
				productRepository.save(product);
			}
		}
	}
}
