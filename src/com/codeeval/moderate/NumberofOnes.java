/**
 * Number of Ones
 * ---------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Write a program which determines the number of 1 bits in the internal representation of a given integer.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. The file contains integers, one per line.
 * For example:
 * 10
 * 22
 * 56
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the number of ones in the binary form of each number.
 * For example:
 * 2
 * 3
 * 3
 */
package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NumberofOnes {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/moderate/test_NumberofOnes.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String num = Integer.toBinaryString(Integer.parseInt(line));
			char[] nums = num.toCharArray();
			int sum = 0;
			for (char c : nums)
				sum += Integer.parseInt(Character.toString(c));
			System.out.println(sum);
		}
	}
}
