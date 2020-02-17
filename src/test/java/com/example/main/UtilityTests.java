package com.example.main;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class UtilityTests {

	@Test
	public void testTruncateAInFirst2Positions() {
		Utility utility = new Utility();
		String expected_Str = "AACD";
		String actual = utility.truncateAInFirst2Positions(expected_Str);
		
		assertEquals("Success", "CD", actual);
	}

}
