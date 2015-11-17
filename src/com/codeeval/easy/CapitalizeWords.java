/**
 * Capitalize Words
 * ------------------
 * CHALLENGE DESCRIPTION:
 * Write a program which capitalizes the first letter of each word in a sentence.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * Hello world
 * javaScript language
 * a letter
 * 1st thing
 * 
 * OUTPUT SAMPLE:
 * Print capitalized words in the following way.
 * Hello World
 * JavaScript Language
 * A Letter
 * 1st Thing
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CapitalizeWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_CapitalizeWords.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(toTitleCase(line));
        }
	}
	
	public static String toTitleCase(String input) {
	    StringBuffer titleCase = new StringBuffer();
	    boolean nextTitleCase = true;

	    for (char c : input.toCharArray()) {
	        if (Character.isSpaceChar(c)) {
	            nextTitleCase = true;
	        } else if (nextTitleCase) {
	            c = Character.toTitleCase(c);
	            nextTitleCase = false;
	        }
	        titleCase.append(c);
	    }
	    return titleCase.toString();
	}
}
