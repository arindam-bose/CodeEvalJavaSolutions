/**
 * Sum of Integers
 * ----------------
 * CHALLENGE DESCRIPTION:
 * Write a program to determine the largest sum of contiguous integers in a list.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a filename containing a comma-separated list of integers, one per line.
 * For example:
 * -10,2,3,-2,0,5,-15
 * 2,3,-2,-1,10
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the largest sum. In other words, of all the possible contiguous subarrays for a given array, 
 * find the one with the largest sum, and print that sum.
 * For example:
 * 8
 * 12
 */
package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class SumofIntegers {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SumofIntegers.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbers = line.split(",");
            int[] sums = new int[(numbers.length + 1) * numbers.length / 2];
            int l = 0;
            for (int i = 0; i < numbers.length; i++) {
            	for (int j = 0; j < numbers.length-i; j++) {
            		int sum = 0;
            		for (int k = i; k <= j+i; k++)
            			sum += Integer.parseInt(numbers[k]);
            		sums[l++] = sum;
            	}
            }
            Arrays.sort(sums);
            System.out.println(sums[sums.length-1]);
        }
	}
}
