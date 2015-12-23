/**
 * Word to Digit
 * --------------
 * CHALLENGE DESCRIPTION:
 * Having a string representation of a set of numbers you need to print this numbers.
 * All numbers are separated by semicolon. There are up to 20 numbers in one line. 
 * The numbers are "zero" to "nine"
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file 
 * is one test case. E.g.
 * zero;two;five;seven;eight;four
 * three;seven;eight;nine;two
 * 
 * OUTPUT SAMPLE:
 * Print numbers in the following way:
 * 025784
 * 37892
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordtoDigit {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_WordtoDigit.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] codes = line.split(";");
            StringBuffer buff = new StringBuffer();
            for (String s : codes) {
            	buff.append(getWordFromLibrary(s));
            }
            System.out.println(buff);
        }
	}
	
	private static String getWordFromLibrary(String key) {
		Map<String, String> library = new HashMap<String, String>();
		library.put("one",   "1");
		library.put("two",   "2");
		library.put("three", "3");
		library.put("four",  "4");
		library.put("five",  "5");
		library.put("six",   "6");
		library.put("seven", "7");
		library.put("eight", "8");
		library.put("nine",  "9");
		library.put("zero",  "0");
		
		return library.get(key);
	}
}
