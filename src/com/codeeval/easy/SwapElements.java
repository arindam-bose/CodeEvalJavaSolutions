/**
 * Swap Elements
 * ---------------
 * @author adambose1990
 * 
 * You are given a list of numbers which is supplemented with positions that have to be swapped.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 1 2 3 4 5 6 7 8 9 : 0-8
 * 1 2 3 4 5 6 7 8 9 10 : 0-1, 1-3
 * As you can see a colon separates numbers with positions. 
 * Positions start with 0. 
 * You have to process positions left to right. In the example above (2nd line) first you process 0-1, then 1-3.
 * 
 * OUTPUT SAMPLE:
 * Print the lists in the following way.
 * 9 2 3 4 5 6 7 8 1
 * 2 4 3 1 5 6 7 8 9 10
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SwapElements {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SwapElements.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			StringBuilder builder = new StringBuilder();
			line = line.trim();
			String[] parts = line.split(":");
			String[] arrStr = parts[0].trim().split(" ");
			String[] swapDistances = parts[1].trim().split(",");
			for (int i = 0; i < swapDistances.length; i++) {
				String[] distance = swapDistances[i].trim().split("-");
				int start = Integer.parseInt(distance[0]);
				int end = Integer.parseInt(distance[1]);
				String temp = arrStr[start];
				arrStr[start] = arrStr[end];
				arrStr[end] = temp;
			}
			for (int i = 0; i < arrStr.length; i++) {
				builder.append(arrStr[i]).append(" ");
			}
			builder.setLength(builder.length() - 1);
			System.out.println(builder);
		}
	}

}
