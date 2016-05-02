package com.qun.web;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Unit test for simple App.
 * copy AppTest实现junit4的测试类
 */
public class AppTest_Junit4{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	/*public AppTest_Junit4(String testName) {
		super(testName);
	}*/

	/**
	 * @return the suite of tests being tested
	 */
	/*public static Test suite() {
		return new TestSuite(AppTest_Junit4.class);
	}*/

	/**
	 * Rigourous Test :-)
	 */
	@Test
	public void testApp() {
		assertTrue(true);
	}
	
	@Test
	public void testAdd(){
		assertEquals(5, new App().add(2, 3));
	}
}
