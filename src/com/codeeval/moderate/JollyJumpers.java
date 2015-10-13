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
