package com.alaa.mabaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alaa.mabaya.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
