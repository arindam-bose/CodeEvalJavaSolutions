/**
 * Happy Numbers
 * --------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * A happy number is defined by the following process. Starting with any positive integer, replace the number by the 
 * sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops 
 * endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers, 
 * while those that do not end in 1 are unhappy numbers.
 * 
 * INPUT SAMPLE:
 * The first argument is the pathname to a file which contains test data, one test case per line. Each line contains 
 * a positive integer. E.g.
 * 1
 * 7
 * 22
 * 
 * OUTPUT SAMPLE:
 * If the number is a happy number, print out 1. If not, print out 0. E.g
 * 1
 * 1
 * 0
 * 
 * For the curious,
 * Here's why 7 is a happy number: 7->49->97->130->10->1.
 * Here's why 22 is NOT a happy number: 22->8->64->52->29->85->89->145->42->20->4->16->37->58->89 ...
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HappyNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_HappyNumbers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int num = Integer.parseInt(line);
			int sum = 0;
			int count = 0;
			while (sum != 1) {
				sum = 0;
				int temp = num;
				while (temp > 0) {
					int i = temp % 10;
					sum += i * i;
					temp = temp / 10;
				}
				count++;
				if (count > 100) {
					System.out.println(0);
					break;
				}
				if (sum == 1) {
					System.out.println(1);
				}
				num = sum;
			}
		}
	}
}
