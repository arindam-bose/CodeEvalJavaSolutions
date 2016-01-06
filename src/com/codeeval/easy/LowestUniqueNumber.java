/**
 * Lowest Unique Number
 * ---------------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * There is a game where each player picks a number from 1 to 9, writes it on a paper and gives to a guide. 
 * A player wins if his number is the lowest unique. We may have 10-20 players in our game.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename.
 * You're a guide and you're given a set of numbers from players for the round of game. E.g. 2 rounds of the game look 
 * this way:
 * 3 3 9 1 6 5 8 1 5 3
 * 9 2 9 9 1 8 8 8 2 1 1
 * 
 * OUTPUT SAMPLE:
 * Print a winner's position or 0 in case there is no winner. In the first line of input sample the lowest unique 
 * number is 6. So player 5 wins.
 * 5
 * 0
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LowestUniqueNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_LowestUniqueNumber.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] nums = line.split(" ");
			Map<Integer, Integer> frequence = new HashMap<Integer, Integer>();
			for (String s : nums) {
				Integer num = Integer.parseInt(s);
				Integer freq = frequence.get(num);
				freq = (freq == null) ? 1 : freq + 1;
				frequence.put(num, freq);
			}
			ArrayList<Integer> arr = new ArrayList<Integer>();
			Iterator<Integer> it = frequence.keySet().iterator();
			while (it.hasNext()) {
				Integer num = it.next();
				if (frequence.get(num) == 1)
					arr.add(num);
			}
			int minIndex = 0;
			if (!arr.isEmpty()) {
				int min = arr.get(0);
				for (int i = 1; i < arr.size(); i++) {
					if (min > arr.get(i)) {
						min = arr.get(i);
					}
				}
				for (int i = 0; i < nums.length; i++) {
					if (Integer.parseInt(nums[i]) == min) {
						minIndex = i + 1;
						break;
					}
				}
			}
			System.out.println(minIndex);
		}
	}
}
