/**
 * Road Trip
 * ----------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You've decided to make a road trip across the country in a straight line. You have chosen the direction 
 * you'd like to travel and made a list of cities in that direction that have gas stations to stop at and 
 * fill up your tank. To make sure that this route is viable, you need to know the distances between the 
 * adjacent cities in order to be able to travel this distance on a single tank of gasoline, (No one likes 
 * running out of gas.) but you only know distances to each city from your starting point.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a filename. Each line in the file contains the list of cities and distances 
 * to them, comma delimited, from the starting point of your trip. You start your trip at point 0. The cities 
 * with their distances are separated by semicolon. E.g.
 * Rkbs,5453; Wdqiz,1245; Rwds,3890; Ujma,5589; Tbzmo,1303;
 * Vgdfz,70; Mgknxpi,3958; Nsptghk,2626; Wuzp,2559; Jcdwi,3761;
 * Yvnzjwk,5363; Pkabj,5999; Xznvb,3584; Jfksvx,1240; Inwm,5720;
 * Ramytdb,2683; Voclqmb,5236;
 * 
 * OUTPUT SAMPLE:
 * Print out the distance from the starting point to the nearest city, and the distances between two nearest 
 * cities separated by comma, in order they appear on the route. E.g.
 * 1245,58,2587,1563,136
 * 70,2489,67,1135,197
 * 1240,2344,1779,357,279
 * 2683,2553
 * 
 * CONSTRAINS: 
 * Cities are unique, and represented by randomly generated string containing latin characters [A-Z][a-z]. 
 * The route length is an integer in range [10000, 30000] 
 * The number of cities is in range [500, 600]
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RoadTrip {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_RoadTrip.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] cities = line.split(";");
			int[] distances = new int[cities.length + 1];
			for (int i = 0; i < cities.length; i++)
				distances[i + 1] = Integer.parseInt(cities[i].substring(cities[i].indexOf(",") + 1));
			Arrays.sort(distances);
			StringBuffer buff = new StringBuffer();
			for (int i = 0; i < cities.length; i++)
				buff.append(distances[i + 1] - distances[i]).append(",");
			System.out.println(buff.substring(0, buff.length() - 1));
		}
	}
}
