/**
 * Rightmost Char
 * ----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You are given a string 'S' and a character 't'. Print out the position of the rightmost occurrence of 't' 
 * (case matters) in 'S' or -1 if there is none. The position to be printed out is zero based.
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename, containing a string and a character, comma delimited, 
 * one per line. Ignore all empty lines in the input file. E.g. 
 * Hello World,r
 * Hello CodeEval,E
 * 
 * OUTPUT SAMPLE:
 * Print out the zero based position of the character 't' in string 'S', one per line. Do NOT print out 
 * empty lines between your output. 
 * E.g.
 * 8
 * 10
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RightmostChar {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_RightmostChar.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;

		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(",");
			System.out.println(words[0].lastIndexOf(words[1].trim()));
		}
	}
}
