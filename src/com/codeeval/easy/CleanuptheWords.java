/**
 * Clean up the Words
 * --------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You have a list of words. Letters of these words are mixed with extra symbols, so it is hard to define 
 * the beginning and end of each word. Write a program that will clean up the words from extra numbers and symbols.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each line includes a test case with a list of words: letters are both 
 * lowercase and uppercase, and are mixed with extra symbols.
 * For example:
 * (--9Hello----World...--)
 * Can 0$9 ---you~
 * 13What213are;11you-123+138doing7
 * 
 * OUTPUT SAMPLE:
 * Print the cleaned up words separated by spaces in lowercase letters.
 * For example:
 * hello world
 * can you
 * what are you doing
 * 
 * CONSTRAINTS:
 * Print the words separated by spaces in lowercase letters.
 * The length of a test case together with extra symbols can be in a range from 10 to 100 symbols.
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CleanuptheWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_CleanuptheWords.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < line.length(); i++) {
				if (Character.isAlphabetic(line.charAt(i)))
					buff.append(Character.toLowerCase(line.charAt(i)));
				else
					buff.append(" ");
			}
			String[] words = buff.toString().split(" ");
			buff = new StringBuffer();
			for (String s : words) {
				if (!"".equals(s))
					buff.append(s).append(" ");
			}
			System.out.println(buff.substring(0, buff.length() - 1));
		}
	}
}
