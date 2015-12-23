/**
 * Even Numbers
 * -------------
 * CHALLENGE DESCRIPTION:
 * Write a program which checks input numbers and determines whether a number is even or not.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 701
 * 4123
 * 2936
 * 
 * OUTPUT SAMPLE:
 * Print 1 if the number is even or 0 if the number is odd.
 * 0
 * 0
 * 1
 * All numbers in input are integers > 0 and < 5000.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EvenNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_EvenNumbers.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (Integer.parseInt(line) % 2 == 0)
            	System.out.println(1);
            else
            	System.out.println(0);
        }
	}
}