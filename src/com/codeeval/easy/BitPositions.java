/**
 * Bit Positions
 * --------------
 * CHALLENGE DESCRIPTION:
 * Given a number n and two integers p1,p2 determine if the bits in position p1 and p2 are the same or not.
 * Positions p1 and p2 are 1 based.
 * 
 * INPUT SAMPLE:
 * The first argument will be a path to a filename containing a comma separated list of 3 integers, 
 * one list per line. E.g.
 * 86,2,3
 * 125,1,2
 * 
 * OUTPUT SAMPLE:
 * Print to stdout, 'true'(lowercase) if the bits are the same, else 'false'(lowercase). E.g.
 * true
 * false
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BitPositions {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_BitPositions.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numStrings = line.split(",");
            String bit = Integer.toBinaryString(Integer.parseInt(numStrings[0]));
            if (bit.charAt(bit.length() - Integer.parseInt(numStrings[1])) == 
            		bit.charAt(bit.length() - Integer.parseInt(numStrings[2])))
            	System.out.println("true");
            else 
            	System.out.println("false");
        }
	}
}
