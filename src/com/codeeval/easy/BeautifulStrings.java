/**Credits: This problem appeared in the Facebook Hacker Cup 2013 Hackathon. 
 * Beautiful Strings
 * -------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * When John was a little kid he didn't have much to do. There was no internet, no Facebook, and no programs 
 * to hack on. So he did the only thing he could... he evaluated the beauty of strings in a quest to discover 
 * the most beautiful string in the world.
 * Given a string s, little Johnny defined the beauty of the string as the sum of the beauty of the letters 
 * in it. The beauty of each letter is an integer between 1 and 26, inclusive, and no two letters have the same 
 * beauty. Johnny doesn't care about whether letters are uppercase or lowercase, so that doesn't affect the 
 * beauty of a letter. (Uppercase 'F' is exactly as beautiful as lowercase 'f', for example.)
 * You're a student writing a report on the youth of this famous hacker. You found the string that Johnny 
 * considered most beautiful. What is the maximum possible beauty of this string?
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file has a sentence. E.g.
 * ABbCcc
 * Good luck in the Facebook Hacker Cup this year!
 * Ignore punctuation, please :)
 * Sometimes test cases are hard to make up.
 * So I just go consult Professor Dalves
 * 
 * OUTPUT SAMPLE:
 * Print out the maximum beauty for the string. E.g.
 * 152
 * 754
 * 491
 * 729
 * 646
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BeautifulStrings {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_BeautifulStrings.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		Map<Character, Integer> charFreq = new HashMap<Character, Integer>();
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			charFreq.clear();
			if (line != null) {
				line = line.toLowerCase();
				for (Character c : line.toCharArray()) {
					if (Character.isAlphabetic(c)) {
						Integer count = charFreq.get(c);
						int newCount = (count == null ? 1 : count + 1);
						charFreq.put(c, newCount);
					}
				}
			}
			int[] freq = new int[charFreq.size()];
			Iterator<Character> it = charFreq.keySet().iterator();
			int maxBeauty = 0;
			int start = 0;
			while (it.hasNext()) {
				freq[start] = charFreq.get(it.next());
				start++;
			}
			Arrays.sort(freq);
			start = 26;
			for (int i = freq.length - 1; i >= 0; i--) {
				maxBeauty += freq[i] * start;
				start--;
			}
			System.out.println(maxBeauty);
		}
	}
}
