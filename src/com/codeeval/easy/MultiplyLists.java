/**
 * Multiply Lists
 * ---------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You have 2 lists of positive integers. Write a program which multiplies corresponding elements in these lists.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 9 0 6 | 15 14 9
 * 5 | 8
 * 13 4 15 1 15 5 | 1 4 15 14 8 2
 * The lists are separated with a pipe char, numbers are separated with a space char. 
 * The number of elements in lists are in range [1, 10]. 
 * The number of elements is the same in both lists. 
 * Each element is a number in range [0, 99].
 * 
 * OUTPUT SAMPLE:
 * Print the result in the following way.
 * 135 0 54
 * 40
 * 13 16 225 14 120 10
 */	
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MultiplyLists {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_MultiplyLists.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] lists = line.split("\\|");
			String[] listFirst = lists[0].trim().split(" ");
			String[] listSecond = lists[1].trim().split(" ");
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < listFirst.length; i++)
				buff.append(Integer.parseInt(listFirst[i]) * Integer.parseInt(listSecond[i])).append(" ");
			System.out.println(buff.substring(0, buff.length()-1));
		}
	}
}
