/**
 * Simple Sorting
 * ---------------
 * CHALLENGE DESCRIPTION:
 * Write a program which sorts numbers.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * 70.920 -38.797 14.354 99.323 90.374 7.581
 * -37.507 -3.263 40.079 27.999 65.213 -55.552
 * 
 * OUTPUT SAMPLE:
 * Print sorted numbers in the following way. Please note, that you need to print the numbers till the 3rd 
 * digit after the dot including trailing zeros.
 * -38.797 7.581 14.354 70.920 90.374 99.323
 * -55.552 -37.507 -3.263 27.999 40.079 65.213
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;

public class SimpleSorting {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SimpleSorting.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        DecimalFormat df = new DecimalFormat("0.000");
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbers = line.split(" ");
            Double[] dNumbers = new Double[numbers.length];
            for (int i = 0; i < numbers.length; i++)
            	dNumbers[i] = Double.parseDouble(numbers[i]);
            Arrays.sort(dNumbers);
            StringBuffer buff = new StringBuffer();
            for (int i = 0; i < dNumbers.length; i++)
            	buff.append(df.format(dNumbers[i])).append(" ");
            System.out.println(buff.substring(0, buff.length()-1));
        }
	}
}