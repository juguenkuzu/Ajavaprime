package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@GetMapping
	public String home() {
		return "Welcome To Revature";
	}
	
	@GetMapping("message")
	public String message() {
		return "-- Revature Training App --";
	}
}
