package com.example.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ArithmeticTest {

	Arithmetic ar =new Arithmetic();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing Add Method ")
	void testAdd() {
		//fail("Not yet implemented");
		assertEquals(10, ar.add(2, 8));
	}

	@Test
	void testWelcome() {
		//fail("Not yet implemented");
		assertEquals("welcome to Nkuzu family", ar.welcome());
	}

}
