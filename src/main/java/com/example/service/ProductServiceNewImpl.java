package com.example.service;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Product;
import com.example.dao.*;

@Service
//@Service(value = "productnewimpl")
public class ProductServiceNewImpl implements ProductService {

	@Autowired
	ProductDao productDAO;

	@Override
	@Transactional(timeout = 30000 ,propagation =  Propagation.NEVER , isolation = Isolation.READ_COMMITTED)
	public void addProduct(Product product) {
		System.out.println("Adding the product in new way");
		// code to check the price
		// addProduct
		// updateStock
		if (product.getPrice() > 0)
			productDAO.save(product);
	}

	@Override
	@Transactional(timeout = 30000 ,propagation =  Propagation.NEVER , isolation = Isolation.READ_UNCOMMITTED)
	public void updateProduct(Product product) {
		productDAO.save(product);

	}

	@Override
	@Transactional(timeout = 30000 ,propagation =  Propagation.NEVER , isolation = Isolation.REPEATABLE_READ)
	public List<Product> getProducts() {
		return productDAO.findAll();
	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		productDAO.deleteById(productId);

	}

	@Override
	@Transactional
	public Product getProduct(int productId) {
		Optional<Product> prod = productDAO.findById(productId);
		return prod.get();
	}

	@Override
	@Transactional
	public boolean isProductExists(int productId) {
		return productDAO.existsById(productId);
	}

	/*
	 * @Override
	 * 
	 * @Transactional public List<Product> getProductByName(String productName) {
	 * 
	 * return productDAO.findByProductName(productName); }
	 * 
	 * @Override
	 * 
	 * @Transactional public List<Product> getProductByPriceRange(int lower, int
	 * upper) { // TODO Auto-generated method stub return
	 * productDAO.findByPriceBetween(lower, upper); }
	 */
	
}


