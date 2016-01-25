/**
 * Self Describing Numbers
 * ------------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * A number is a self-describing number when (assuming digit positions are labeled 0 to N-1), the digit in each 
 * position is equal to the number of times that that digit appears in the number.
 * 
 * INPUT SAMPLE:
 * The first argument is the pathname to a file which contains test data, one test case per line. Each line 
 * contains a positive integer. E.g.
 * 2020
 * 22
 * 1210
 * 
 * OUTPUT SAMPLE:
 * If the number is a self-describing number, print out 1. If not, print out 0. E.g.
 * 1
 * 0
 * 1
 * For the curious, here's how 2020 is a self-describing number: Position '0' has value 2 and there is two 0 in 
 * the number. Position '1' has value 0 because there are not 1's in the number. Position '2' has value 2 and 
 * there is two 2. And the position '3' has value 0 and there are zero 3's.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SelfDescribingNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SelfDescribingNumbers.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			Map<Character, Integer> mapCount = new HashMap<Character, Integer>();
			for (Character c : line.toCharArray()) {
				if (mapCount.containsKey(c))
					mapCount.put(c, mapCount.get(c) + 1);
				else
					mapCount.put(c, 1);
			}

			boolean yes = true;
			for (int i = 0; i < line.length(); i++) {
				int freq = 0;
				if (mapCount.get((char) (i + '0')) != null) 
					freq = mapCount.get((char) (i + '0'));
				if (line.charAt(i) != (char) (freq + '0')) {
					yes = false;
					break;
				}
			}
			System.out.println(yes ? 1 : 0);
		}
	}
}
