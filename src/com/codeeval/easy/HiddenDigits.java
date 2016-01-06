/**
 * Hidden Digits
 * -------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * In this challenge you're given a random string containing hidden and visible digits. The digits are hidden 
 * behind lower case latin letters as follows: 0 is behind 'a', 1 is behind 'b' etc., 9 is behind 'j'. Any 
 * other symbol in the string means nothing and has to be ignored. So the challenge is to find all visible and 
 * hidden digits in the string and print them out in order of their appearance.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file contains a 
 * string. You may assume that there will be no white spaces inside the string. E.g.
 * abcdefghik
 * Xa,}A#5N}{xOBwYBHIlH,#W
 * (ABW>'yy^'M{X-K}q,
 * 6240488
 * 
 * OUTPUT SAMPLE:
 * For each test case print out all visible and hidden digits in order of their appearance. Print out NONE in case 
 * there is no digits in the string. E.g.
 * 012345678
 * 05
 * NONE
 * 6240488
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HiddenDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_HiddenDigits.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			StringBuffer buff = new StringBuffer();
			for (char c : line.toCharArray()) {
				switch (c) {
				case '0':
				case 'a':
					buff.append('0');
					break;
				case '1':
				case 'b':
					buff.append('1');
					break;
				case '2':
				case 'c':
					buff.append('2');
					break;
				case '3':
				case 'd':
					buff.append('3');
					break;
				case '4':
				case 'e':
					buff.append('4');
					break;
				case '5':
				case 'f':
					buff.append('5');
					break;
				case '6':
				case 'g':
					buff.append('6');
					break;
				case '7':
				case 'h':
					buff.append('7');
					break;
				case '8':
				case 'i':
					buff.append('8');
					break;
				case '9':
				case 'j':
					buff.append('9');
				}
			}
			if (buff.length() == 0)
				buff.append("NONE");
			System.out.println(buff);
		}
	}
}
