/**
 * Split the Number
 * -----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You are given a number N and a pattern. The pattern consists of lowercase latin letters and one operation "+" or "-". 
 * The challenge is to split the number and evaluate it according to this pattern e.g. 
 * 1232 ab+cd -> a:1, b:2, c:3, d:2 -> 12+32 -> 44
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line of the file is a test case, 
 * containing the number and the pattern separated by a single whitespace. E.g.
 * 3413289830 a-bcdefghij
 * 776 a+bc
 * 12345 a+bcde
 * 1232 ab+cd
 * 90602 a+bcde
 * 
 * OUTPUT SAMPLE:
 * For each test case print out the result of pattern evaluation. E.g.
 * -413289827
 * 83
 * 2346
 * 44
 * 611
 * 
 * CONSTRAINTS: 
 * N is in range [100, 1000000000]
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SplittheNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SplittheNumber.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			long result = 0;
			if (words[1].contains("+")) {
				String[] splitted = words[1].split("\\+");
				result = Long.parseLong(words[0].substring(0, splitted[0].length()))
						+ Long.parseLong(words[0].substring(splitted[0].length()));
			} else if (words[1].contains("-")) {
				String[] splitted = words[1].split("-");
				result = Long.parseLong(words[0].substring(0, splitted[0].length()))
						- Long.parseLong(words[0].substring(splitted[0].length()));
			}
			System.out.println(result);
		}
	}
}
