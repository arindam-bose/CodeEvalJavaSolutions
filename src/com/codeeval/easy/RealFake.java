/**
 * Real Fake
 * ----------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * The police caught a swindler with a big pile of credit cards. Some of them are stolen and some are fake. 
 * It would take too much time to determine which ones are real and which are fake, so you need to write a 
 * program to check credit cards. 
 * To determine which credit cards are real, double every third number starting from the first one, add them 
 * together, and then add them to those figures that were not doubled. If the total sum of all numbers is 
 * divisible by 10 without remainder, then this credit card is real. 
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each row includes a test case with a credit card number that you need to check.
 * 9999 9999 9999 9999
 * 9999 9999 9999 9993
 * 
 * OUTPUT SAMPLE:
 * If a credit card is fake – print Fake, if it’s real – print Real.
 * Fake
 * Real
 * 
 * CONSTRAINTS:
 * The credit card number is 16 digits in length.
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RealFake {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_RealFake.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] parts = line.split(" ");
			int sum = 0;
			for (int i = 0; i < parts.length; i++) {
				int num = Integer.parseInt(parts[i]);
				boolean yes = true;
				while (num > 0) {
					int r = num % 10;
					if (yes)
						sum += r;
					else
						sum += 2 * r;
					yes = !yes;
					num = num / 10;
				}
			}
			System.out.println(sum % 10 == 0 ? "Real" : "Fake");
		}
	}
}
