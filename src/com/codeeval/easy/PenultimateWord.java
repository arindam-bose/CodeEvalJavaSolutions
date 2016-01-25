/**
 * Penultimate Word
 * -----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * Write a program which finds the next-to-last word in a string.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * some line with text
 * another line
 * Each line has more than one word.
 * 
 * OUTPUT SAMPLE:
 * Print the next-to-last word in the following way.
 * with
 * another
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PenultimateWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_PenultimateWord.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			System.out.println(words[words.length - 2]);
		}
	}
}
