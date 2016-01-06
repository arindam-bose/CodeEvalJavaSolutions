/**
 * Lettercase Percentage Ratio
 * ----------------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Your task is to write a program which determines (calculates) the percentage ratio of lowercase 
 * and uppercase letters.
 * 
 * INPUT SAMPLE:
 * Your program should accept a file as its first argument. Each line of input contains a string with 
 * uppercase and lowercase letters.
 * For example:
 * thisTHIS
 * AAbbCCDDEE
 * N
 * UkJ
 * 
 * OUTPUT SAMPLE:
 * For each line of input, print the percentage ratio of uppercase and lowercase letters rounded to 
 * the second digit after the point.
 * For example:
 * lowercase: 50.00 uppercase: 50.00
 * lowercase: 20.00 uppercase: 80.00
 * lowercase: 0.00 uppercase: 100.00
 * lowercase: 33.33 uppercase: 66.67
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class LettercasePercentageRatio {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_LettercasePercentageRatio.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		DecimalFormat df = new DecimalFormat("#0.00");
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			double lowerCase = 0, upperCase = 0;
			for (char c : line.toCharArray()) {
				if (Character.isLowerCase(c))
					lowerCase++;
				else if (Character.isUpperCase(c))
					upperCase++;
			}
			System.out.println("lowercase: " + df.format(lowerCase / line.length() * 100) + " uppercase: "
					+ df.format(upperCase / line.length() * 100));
		}
	}
}
