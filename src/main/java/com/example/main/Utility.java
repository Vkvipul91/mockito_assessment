package com.example.main;

public class Utility {

	public String truncateAInFirst2Positions(String str) {
		if(str.length()<=2)
			return str.replaceAll("A", " ");
		
		String first2Chars = str.substring(0, 2);
		String truncatedStr= str.substring(2);
		
		return first2Chars.replaceAll("A", "") + truncatedStr;
	}
	
	public String toUpperCase(String lowerCaseStr) {
		String uppercase = lowerCaseStr.toUpperCase();
		return uppercase ;
		
	}
	
}
