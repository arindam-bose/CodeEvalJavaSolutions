/**
 * String Mask
 * ------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You've got a binary code which has to be buried among words in order to unconsciously pass the cipher. 
 * Create a program that would cover the word with a binary mask. If, while covering, a letter finds itself 
 * as 1, you have to change its register to the upper one, if it’s 0, leave it as it is. Words are always in 
 * lower case and in the same row with the binary mask.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each row contains a test case with a word and a binary code separated 
 * with space, inside of it. The length of each word is equal to the length of the binary code.
 * For example:
 * hello 11001
 * world 10000
 * cba 111
 * 
 * OUTPUT SAMPLE:
 * Print the encrypted words without binary code.
 * For example:
 * HEllO
 * World
 * CBA
 * 
 * CONSTRAINTS:
 * Words are from 1 to 20 letters long.
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StringMask {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_StringMask.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] words = line.split(" ");
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < words[1].length(); i++) {
				if (words[1].charAt(i) == '1') {
					char c = 0;
					if (Character.isLowerCase(words[0].charAt(i)))
						c = Character.toUpperCase(words[0].charAt(i));
					else if (Character.isUpperCase(words[0].charAt(i)))
						c = Character.toLowerCase(words[0].charAt(i));
					buff.append(c);
				} else
					buff.append(words[0].charAt(i));
			}
			System.out.println(buff);
		}
	}
}
