/** 
 * Jolly Jumpers
 * --------------
 * CHALLENGE DESCRIPTION:
 * Credits: Programming Challenges by Steven S. Skiena and Miguel A. Revilla 
 * A sequence of n > 0 integers is called a jolly jumper if the absolute values of the differences between 
 * successive elements take on all possible values 1 through n - 1. eg. 
 * 1 4 2 3 
 * is a jolly jumper, because the absolute differences are 3, 2, and 1, respectively. The definition implies 
 * that any sequence of a single integer is a jolly jumper. Write a program to determine whether each of a number 
 * of sequences is a jolly jumper. 
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line in this file is one test case. 
 * Each test case will contain an integer n < 3000 followed by n integers representing the sequence. The integers 
 * are space delimited.
 * For example:
 * 4 1 4 2 3
 * 3 7 7 8
 * 9 8 9 7 10 6 12 17 24 38
 * 
 * OUTPUT SAMPLE:
 * For each line of input generate a line of output saying 'Jolly' or 'Not jolly'.
 * For example:
 * Jolly
 * Not jolly
 * Not jolly
 */
package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class JollyJumpers {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_JollyJumpers.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] nums = line.split(" ");
            int[] intNum = new int[nums.length-1];
            int[] results = new int[nums.length-2];
            int[] resultsDup = new int[nums.length-2];
            for (int i = 1; i < nums.length; i++) {
            	intNum[i-1] = Integer.parseInt(nums[i]);
            }
            
            for (int i = 1; i < intNum.length; i++) {
            	results[i-1] = Math.abs(intNum[i] - intNum[i-1]);
            }

            Arrays.sort(results);
	        for (int i = 0; i < results.length; i++) {
	        	resultsDup[i] = i+1;
	        }
	        if (Arrays.equals(results, resultsDup))
	        	System.out.println("Jolly");
	        else
	        	System.out.println("Not jolly");
        }
	}
}
