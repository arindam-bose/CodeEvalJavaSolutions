/**
 * Sum of Integers from File
 * ---------------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Print out the sum of integers read from a file.
 * 
 * INPUT SAMPLE:
 * The first argument to the program will be a path to a filename containing a positive integer, 
 * one per line. E.g.
 * 5
 * 12
 * 
 * OUTPUT SAMPLE:
 * Print out the sum of all the integers read from the file. E.g.
 * 17
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SumofIntegersfromFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SumofIntegersfromFile.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int sum = 0;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			sum += Integer.parseInt(line);
		}
		System.out.println(sum);
	}
}
