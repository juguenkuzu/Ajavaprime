package com.example.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.model.Product;

//@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
	
	/*
	 * public List<Product> findByProductName(String productName); public
	 * List<Product> findByPriceBetween(int low, int high);
	 */
	 
}
