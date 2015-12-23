/**
 * Hex to Decimal
 * ---------------
 * CHALLENGE DESCRIPTION:
 * You will be given a hexadecimal (base 16) number. Convert it into decimal (base 10).
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file contains 
 * a hex number. You may assume that the hex number does not have the leading 'Ox'. Also all alpha characters 
 * (a through f) in the input will be in lowercase. E.g.
 * 9f
 * 11
 * 
 * OUTPUT SAMPLE:
 * Print out the equivalent decimal number. E.g.
 * 159
 * 17
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class HextoDecimal {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_HextoDecimal.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(Integer.parseInt(line, 16));
        }
	}
}
