/**
 * Football
 * ---------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * People around the world watch football matches and root for different football teams. Some people are fans 
 * of Real Madrid, some like Barcelona, some pull for Atletico Madrid, while others do not miss a single match 
 * with FC Bayern Munich.
 * The teams would like to know people in which countries cheer for them. So, let’s help them!
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each row includes a test case with lists of countries. Lists are 
 * separated by pipelines '|'. Each list includes football teams that people in these countries root for.
 * For example:
 * 1 2 3 4 | 3 1 | 4 1
 * 19 11 | 19 21 23 | 31 39 29
 * 
 * OUTPUT SAMPLE:
 * For each football team, print a list of countries where people root for them. Separate each team by a 
 * semicolon ';' and a space. All output should be sorted.
 * For example:
 * 1:1,2,3; 2:1; 3:1,2; 4:1,3;
 * 11:1; 19:1,2; 21:2; 23:2; 29:3; 31:3; 39:3;
 * 
 * CONSTRAINTS:
 * The number of countries lists can be from 3 to 20.
 * Each list contains a different number of football teams: from 1 to 7.
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Football {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_Football.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			Map<Integer, ArrayList<Integer>> mapFinal = new HashMap<Integer, ArrayList<Integer>>();
			String[] countries = line.split("\\|");
			for (int i = 0; i < countries.length; i++) {
				String[] supporters = countries[i].trim().split(" ");
				for (int j = 0; j < supporters.length; j++) {
					ArrayList<Integer> list = mapFinal.get(Integer.parseInt(supporters[j]));
					if (list == null)
						list = new ArrayList<Integer>();
					list.add(i + 1);
					mapFinal.put(Integer.parseInt(supporters[j]), list);
				}
			}
			Integer[] array = mapFinal.keySet().toArray(new Integer[0]);
			Arrays.sort(array);
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < array.length; i++) {
				Integer key = array[i];
				ArrayList<Integer> list = mapFinal.get(key);
				buff.append(key).append(":");
				for (int j = 0; j < list.size(); j++) {
					if (j + 1 != list.size())
						buff.append(list.get(j)).append(",");
					else
						buff.append(list.get(j)).append(";");
				}
				if (i + 1 != array.length)
					buff.append(" ");
			}
			System.out.println(buff);
		}
	}
}
