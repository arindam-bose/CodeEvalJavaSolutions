/** Credits: Programming Challenges by Houghton Mifflin Harcourt
 * String Permutations
 * ---------------------
 * CHALLENGE DESCRIPTION:
 * Write a program which prints all the permutations of a string in alphabetical order. We consider that digits 
 * < upper case letters < lower case letters. The sorting should be performed in ascending order.
 * 
 * INPUT SAMPLE:
 * Your program should accept a file as its first argument. The file contains input strings, one per line.
 * For example:
 * hat
 * abc
 * Zu6
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the permutations of the string separated by comma, in alphabetical order.
 * For example:
 * aht,ath,hat,hta,tah,tha
 * abc,acb,bac,bca,cab,cba
 * 6Zu,6uZ,Z6u,Zu6,u6Z,uZ6
 */
package com.codeeval.hard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class StringPermutations {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_StringPermutations.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            ArrayList<String> res = permutation(line);
            StringBuffer strBuffer = new StringBuffer();
            for (int i = 0; i < res.size(); i++) {
            	strBuffer.append(res.get(i)).append(',');
            }
            strBuffer.setLength(strBuffer.length()-1);
        	System.out.println(strBuffer);
        }
	}
	
	public static ArrayList<String> permutation(String s) {
	    ArrayList<String> res = new ArrayList<String>();
	    if (s.length() == 1) {
	        res.add(s);
	    } else if (s.length() > 1) {
	        int lastIndex = s.length() - 1;
	        String last = s.substring(lastIndex);
	        String rest = s.substring(0, lastIndex);
	        res = merge(permutation(rest), last);
	    }
	    Collections.sort(res);
	    return res;
	}

	public static ArrayList<String> merge(ArrayList<String> list, String c) {
	    ArrayList<String> res = new ArrayList<String>();
	    for (String s : list) {
	        for (int i = 0; i <= s.length(); ++i) {
	            String ps = new StringBuffer(s).insert(i, c).toString();
	            res.add(ps);
	        }
	    }
	    return res;
	}
}
