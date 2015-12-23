/**
 * Fibonacci Series
 * -----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * The Fibonacci series is defined as: F(0) = 0; F(1) = 1; F(n) = F(n–1) + F(n–2) when n>1. 
 * Given an integer n>=0, print out the F(n).
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing integer numbers, one per line. E.g.
 * 5
 * 12
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, the fibonacci number, F(n). E.g.
 * 5
 * 144
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FibonacciSeries {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_FibonacciSeries.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int num = Integer.parseInt(line);
			int[] numFibo = new int[num + 1];
			numFibo[0] = 0;
			if (num > 0)
				numFibo[1] = 1;
			if (num >= 2) {
				int i = 2;
				while (i <= num) {
					numFibo[i] = numFibo[i - 1] + numFibo[i - 2];
					i++;
				}
			}
			System.out.println(numFibo[num]);
		}
	}
}
