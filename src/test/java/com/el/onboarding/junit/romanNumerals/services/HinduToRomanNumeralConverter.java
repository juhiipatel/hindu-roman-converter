package com.el.onboarding.junit.romanNumerals.services;

import java.util.TreeMap;

public class HinduToRomanNumeralConverter {
	
	//create a treemap that will hold integer and strings, consecutively
	private static TreeMap<Integer, String> tree = new TreeMap<Integer, String>();
	
	static {
		tree.put(1000, "M");
        tree.put(900, "CM");
        tree.put(500, "D");
        tree.put(400, "CD");
        tree.put(100, "C");
        tree.put(90, "XC");
        tree.put(50, "L");
        tree.put(40, "XL");
        tree.put(10, "X");
        tree.put(9, "IX");
        tree.put(5, "V");
        tree.put(4, "IV");
        tree.put(1, "I");
	}
	

	//Method to convert the integer inputs to a roman numeral string
	public static String convert(int n) {
		
		//round the int to the greatest value from defined above that doesn't exceed the given int n
		int i = tree.floorKey(n);
		
		//if the given int n is equal to when rounded by the floorKey method, return the
		//matched branch of the tree 
		if( n == i) {
			return tree.get(n);
		}
		
		//otherwise return the converted string of i, and subtract the int n from the rounded i and restart the method until completed
		//the entire integer given and have a complete string converted
		return tree.get(i) + convert(n - i);
	}
}

