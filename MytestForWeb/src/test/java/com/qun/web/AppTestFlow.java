package com.qun.web;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AppTestFlow {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before class ...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after class ...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before ...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after ...");
	}

	@Test
	public void testDivide() {
		System.out.println("test divide");
	}
	
	@Test
	public void testAdd() {
		System.out.println("test add");
	}

}
