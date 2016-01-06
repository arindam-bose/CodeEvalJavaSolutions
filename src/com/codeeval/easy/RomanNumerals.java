/**
 * Roman Numerals
 * ---------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Many persons are familiar with the Roman numerals for relatively small numbers. 
 * The symbols I (capital i), V, X, L, C, D, and M represent the decimal values 1, 5, 10, 50, 100, 500 and 1000 respectively.
 * To represent other values, these symbols, and multiples where necessary, are concatenated, with the smaller-valued 
 * symbols written further to the right. For example, the number 3 is represented as III, and the value 73 is represented 
 * as LXXIII. The exceptions to this rule occur for numbers having units values of 4 or 9, and for tens values of 40 or 90. 
 * For these cases, the Roman numeral representations are IV (4), IX (9), XL (40), and XC (90). So the Roman numeral 
 * representations for 24, 39, 44, 49, and 94 are XXIV, XXXIX, XLIV, XLIX, and XCIV, respectively.
 * Write a program to convert a cardinal number to a Roman numeral.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 159
 * 296
 * 3992
 * Input numbers are in range [1, 3999]
 * 
 * OUTPUT SAMPLE:
 * Print out Roman numerals.
 * CLIX
 * CCXCVI
 * MMMCMXCII
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {

	static LinkedHashMap<String, Integer> romanNumerals = new LinkedHashMap<String, Integer>();

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_RomanNumerals.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int num = Integer.parseInt(line);
			System.out.println(toRomanNumerals(num));
		}
	}

	private static String toRomanNumerals(int num) {
		romanNumerals.put("M", 1000);
		romanNumerals.put("CM", 900);
		romanNumerals.put("D", 500);
		romanNumerals.put("CD", 400);
		romanNumerals.put("C", 100);
		romanNumerals.put("XC", 90);
		romanNumerals.put("L", 50);
		romanNumerals.put("XL", 40);
		romanNumerals.put("X", 10);
		romanNumerals.put("IX", 9);
		romanNumerals.put("V", 5);
		romanNumerals.put("IV", 4);
		romanNumerals.put("I", 1);
		String res = "";
		for (Map.Entry<String, Integer> entry : romanNumerals.entrySet()) {
			int matches = num / entry.getValue();
			res += repeat(entry.getKey(), matches);
			num = num % entry.getValue();
		}
		return res;
	}

	public static String repeat(String s, int n) {
		if (s == null) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(s);
		}
		return sb.toString();
	}
}