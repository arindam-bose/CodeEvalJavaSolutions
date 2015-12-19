/**
 * UniqueElements
 * ---------------
 * CHALLENGE DESCRIPTION:
 * You are given a sorted list of numbers with duplicates. Print out the sorted list with duplicates removed.
 * 
 * INPUT SAMPLE:
 * File containing a list of sorted integers, comma delimited, one per line. E.g. 
 * 1,1,1,2,2,3,3,4,4
 * 2,3,4,5,5
 * 
 * OUTPUT SAMPLE:
 * Print out the sorted list with duplicates removed, one per line. E.g.
 * 1,2,3,4
 * 2,3,4,5
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UniqueElements {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_UniqueElements.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] numbers = line.split(",");
            ArrayList<String> arrString = new ArrayList<String>();
            for(String s : numbers) {
            	if (!arrString.contains(s))
            		arrString.add(s);
            }
            StringBuffer buff = new StringBuffer();
            for (String s : arrString) {
            	buff.append(s).append(",");
            }
            System.out.println(buff.substring(0, buff.length()-1));
        }
	}
}