/**
 * Longest Word
 * -------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * In this challenge you need to find the longest word in a sentence. If the sentence has more than one word of 
 * the same length you should pick the first one.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * some line with text
 * another line
 * Each line has one or more words. Each word is separated by space char.
 * 
 * OUTPUT SAMPLE:
 * Print the longest word in the following way.
 * some
 * another
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_LongestWord.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			int[] lengths = new int[words.length];
			for (int i = 0; i < words.length; i++) {
				lengths[i] = words[i].length();
			}
			int maxIdx = 0;
			for (int i = 1; i < lengths.length; i++) {
				if (lengths[maxIdx] < lengths[i])
					maxIdx = i;
			}
			System.out.println(words[maxIdx]);
		}
	}
}
