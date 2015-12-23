/**
 * N Mod M
 * ---------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Given two integers N and M, calculate N Mod M (without using any inbuilt modulus operator).
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file contains 
 * two comma separated positive integers. E.g.
 * 20,6
 * 2,3
 * You may assume M will never be zero.
 * 
 * OUTPUT SAMPLE:
 * Print out the value of N Mod M
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NModM {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_NModM.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] nums = line.split(",");
			int num = Integer.parseInt(nums[0]) % Integer.parseInt(nums[1]);
			System.out.println(num);
		}
	}
}
