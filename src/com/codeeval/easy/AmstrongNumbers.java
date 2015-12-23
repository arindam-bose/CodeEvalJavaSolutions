/**
 * Amstrong Numbers
 * ------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * An Armstrong number is an n-digit number that is equal to the sum of the n'th powers of its digits. 
 * Determine if the input numbers are Armstrong numbers.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file has a 
 * positive integer. E.g.
 * 6
 * 153
 * 351
 * 
 * OUTPUT SAMPLE:
 * Print out True/False if the number is an Armstrong number or not. E.g.
 * True
 * True
 * False
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AmstrongNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_AmstrongNumbers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int len = line.length();
			int num = Integer.parseInt(line);
			int temp = num;
			int sum = 0;
			while (temp > 0) {
				int i = temp % 10;
				sum += Math.pow(i, len);
				temp = temp / 10;
			}
			if (sum == num)
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}
