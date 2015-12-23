/**
 * Set Intersection
 * ------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You are given two sorted list of numbers (ascending order). The lists themselves are comma delimited and the two 
 * lists are semicolon delimited. Print out the intersection of these two sets.
 * 
 * INPUT SAMPLE:
 * File containing two lists of ascending order sorted integers, comma delimited, one per line. E.g. 
 * 1,2,3,4;4,5,6
 * 20,21,22;45,46,47
 * 7,8,9;8,9,10,11,12
 * 
 * OUTPUT SAMPLE:
 * Print out the ascending order sorted intersection of the two lists, one per line. Print empty new line in case 
 * the lists have no intersection. E.g. 
 * 4
 * 
 * 8,9
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class SetIntersection {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_SetIntersection.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] sets = line.split(";");
			String[] set0 = sets[0].split(",");
			String[] set1 = sets[1].split(",");
			ArrayList<String> listSet0 = new ArrayList<String>(Arrays.asList(set0));
			ArrayList<String> arrString = new ArrayList<String>();
			for (String s : set1) {
				if (listSet0.contains(s))
					arrString.add(s);
			}
			if (!arrString.isEmpty()) {
				StringBuffer buff = new StringBuffer();
				for (String s : arrString) {
					buff.append(s).append(",");
				}
				System.out.println(buff.substring(0, buff.length() - 1));
			} else
				System.out.println();
		}
	}
}
