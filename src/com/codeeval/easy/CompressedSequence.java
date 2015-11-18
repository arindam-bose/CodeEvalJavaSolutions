/**
 * Compressed Sequence
 * ---------------------
 * CHALLENGE DESCRIPTION:
 * Assume that someone dictates you a sequence of numbers, and you need to write it down. For brevity, he dictates 
 * it as follows: first he dictates the number of consecutive identical numbers, and then - the number itself.
 * For example:
 * The sequence below
 * 1 1 3 3 3 2 2 2 2 14 14 14 11 11 11 2
 * is dictated as follows:
 * two times one, three times three, four times two, three times fourteen, three times eleven, one time two
 * and you have to write down the sequence
 * 2 1 3 3 4 2 3 14 3 11 1 2
 * Your task is to write a program that compresses a given sequence using this approach.
 * 
 * INPUT SAMPLE:
 * Your program should accept a path to a file as its first argument that contains T number of lines. Each line 
 * is a test case represented by a sequence of integers with the length L, where each integer is N separated by a space.
 * 40 40 40 40 29 29 29 29 29 29 29 29 57 57 92 92 92 92 92 86 86 86 86 86 
 * 86 86 86 86 86
 * 73 73 73 73 41 41 41 41 41 41 41 41 41 41
 * 1 1 3 3 3 2 2 2 2 14 14 14 11 11 11 2
 * 7
 * 
 * OUTPUT SAMPLE:
 * For each test case, print out a compressed sequence of numbers separated by a single space, one per line.
 * For example:
 * 4 40 8 29 2 57 5 92 10 86
 * 4 73 10 41
 * 2 1 3 3 4 2 3 14 3 11 1 2
 * 1 7
 * 
 * CONSTRAINTS:
 * T is in a range from 20 to 50.
 * N is in a range from 0 to 99.
 * L is in a range from 1 to 400.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CompressedSequence {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_CompressedSequence.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] nums = line.split(" ");
            StringBuffer numBuffer = new StringBuffer();
            String current = nums[0];
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
            	if (current.equals(nums[i])) {
            		count++;
            	} else {
            		numBuffer.append(count).append(" ").append(current).append(" ");
            		count = 1;
            		current = nums[i];
            	}
            }
            numBuffer.append(count).append(" ").append(current);
            System.out.println(numBuffer);
        }
	}
}
