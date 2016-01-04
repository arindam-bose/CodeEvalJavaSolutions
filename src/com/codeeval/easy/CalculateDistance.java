/**
 * Calculate Distance
 * -------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You have coordinates of 2 points and need to find the distance between them.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * (25, 4) (1, -6)
 * (47, 43) (-25, -11)
 * All numbers in input are integers between -100 and 100.
 * 
 * OUTPUT SAMPLE:
 * Print results in the following way.
 * 26
 * 90
 * You don't need to round the results you receive. They must be integer numbers.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculateDistance {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_CalculateDistance.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			Pattern p = Pattern.compile("\\((.*?)\\,(.*?)\\)");
			Matcher m = p.matcher(line);
			int[] x = new int[2], y = new int[2];
			int i = 0;
			while(m.find()) {
				x[i] = Integer.parseInt(m.group(1).trim());
				y[i] = Integer.parseInt(m.group(2).trim());
			    i++;
			}
			int distance = (int) Math.sqrt(Math.pow((x[0]-x[1]), 2) + Math.pow((y[0]-y[1]), 2));
			System.out.println(distance);
		}
	}
}
