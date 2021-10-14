package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Entity
@Table(name = "Products")
@Component
public class Product {
	
	@Id
	//private int productId;
	//private String productName;
	//private int quantityOnHand;
	//private int price;
	//@Column(name = "product_id")
	private int productid;
	//private int product_id;
	//@Column(name = "product_name")
	private String productname;
	//private String product_name;
	
	//@Column(name = "quantity_on_hand")
	private int quantityonhand;
	//private int quantity_on_hand;
	//@Column(name = "price")
	private int price;
	
	public void displayjugue() {
	System.out.println("Hello Jugue Yorgue");
		
	}
	
}
