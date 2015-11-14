/**
 * Odd Numbers
 * -------------
 * CHALLENGE DESCRIPTION:
 * Print the odd numbers from 1 to 99.
 * 
 * INPUT SAMPLE:
 * There is no input for this program.
 * 
 * OUTPUT SAMPLE:
 * Print the odd numbers from 1 to 99, one number per line. 
 */
package com.codeeval.easy;

import java.io.IOException;

public class OddNumbers {

	public static void main(String[] args) throws IOException {
		for (int i = 1; i <= 99; i += 2) {
			System.out.println(i);
		}
	}
}
