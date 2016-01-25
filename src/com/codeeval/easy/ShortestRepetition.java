/**
 * Shortest Repetition
 * --------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Write a program to determine the shortest repetition in a string. 
 * A string is said to have period p if it can be formed by concatenating one or more repetitions of another 
 * string of length p. For example, the string "xyzxyzxyzxyz" has period 3, since it is formed by 4 repetitions 
 * of the string "xyz". It also has periods 6 (two repetitions of "xyzxyz") and 12 (one repetition of "xyzxyzxyzxyz").
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line will contain a string of up to 
 * 80 non-blank characters. E.g.
 * abcabcabcabc
 * bcbcbcbcbcbcbcbcbcbcbcbcbcbc
 * dddddddddddddddddddd
 * adcdefg
 * 
 * OUTPUT SAMPLE:
 * Print out the smallest period of the input string. E.g.
 * 3
 * 2
 * 1
 * 7
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ShortestRepetition {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_ShortestRepetition.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			for (int i = 0; i < line.length(); i++) {
				String sub = line.substring(0, i + 1);

				String[] lineArray = line.split(sub);

				boolean yes = true;
				for (String s : lineArray) {
					if (!s.isEmpty()) {
						yes = false;
						break;
					}
				}

				if (yes) {
					System.out.println(sub.length());
					break;
				}
			}
		}
	}
}
