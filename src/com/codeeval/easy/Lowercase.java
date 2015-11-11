/**
 * Lowercase
 * ----------
 * CHALLENGE DESCRIPTION:
 * Given a string write a program to convert it into lowercase.
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing sentences, one per line. You can assume all characters 
 * are from the English language. E.g.
 * HELLO CODEEVAL
 * This is some text
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, the lowercase version of the sentence, each on a new line. E.g.
 * hello codeeval
 * this is some text
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Lowercase {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_Lowercase.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(line.toLowerCase());
        }
	}
}
