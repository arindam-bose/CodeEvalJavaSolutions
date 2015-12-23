/**
 * Sum of Digits
 * --------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Given a positive integer, find the sum of its constituent digits.
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing positive integers, one per line. E.g.
 * 23
 * 496
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, the sum of the numbers that make up the integer, one per line. E.g.
 * 5
 * 19
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumofDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SumofDigits.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			char[] num = line.toCharArray();
			int sum = 0;
			for (int i = 0; i < num.length; i++) {
				sum += Integer.parseInt(Character.toString(num[i]));
			}
			System.out.println(sum);
		}
	}
}
