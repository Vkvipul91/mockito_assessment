package com.example.main;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UtilityTests {

	Utility utility;
	//Before class annotatioon should be on static test method
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("@Beforeclass executed");
	}
	
	@Before
	public void beforeTest() {
		utility = new Utility();
		System.out.println("@Before executed");
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		
		String input_Str = "AACD";
		String actual = utility.truncateAInFirst2Positions(input_Str);
		
		assertEquals("Success", "CD", actual);
	}
	
	@Test 
	public void testtoUpperCase() {
		String inputStr = "abc";
		String actual = utility.toUpperCase(inputStr);
		assertEquals("ABC", actual);

		
	}
	
	@After
	public void afterTest() {
		System.out.println("@After Executed");
	}

	@AfterClass
	public static void testAfterClass() {
		System.out.println("@AfterClass executed");
	}
	
}
