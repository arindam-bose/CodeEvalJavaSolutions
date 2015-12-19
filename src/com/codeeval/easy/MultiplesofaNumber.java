/**
 * Multiples of a Number
 * -----------------------
 * CHALLENGE DESCRIPTION:
 * Given numbers x and n, where n is a power of 2, print out the smallest multiple of n which is greater than or 
 * equal to x. Do not use division or modulo operator.
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing a comma separated list of two integers, one list 
 * per line. E.g.
 * 13,8
 * 17,16
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, the smallest multiple of n which is greater than or equal to x, one per line. E.g.
 * 16
 * 32
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MultiplesofaNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_MultiplesofaNumber.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbers = line.split(",");
            int i = 1;
            while(i*Integer.parseInt(numbers[1]) < Integer.parseInt(numbers[0])) {
            	i++;
            }
            System.out.println(i*Integer.parseInt(numbers[1]));
        }
	}
}
