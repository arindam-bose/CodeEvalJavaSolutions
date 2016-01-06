/**
 * Black Card
 * -----------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You must have heard about pirates, their customs, pirates code, and the “black spot”. If a pirate is presented 
 * with a “black spot”, he is officially pronounced guilty, meaning he will soon be expulsed from the pirate brotherhood 
 * or even be dead. We don’t have as strict rules as pirates have, and a person who receives a black spot simply leaves 
 * the game. For example, we have a list of three players: John, Tom, Mary, and a number 5. Starting with the first 
 * player (in our case, it’s John), we start to count all players: John – 1, Tom – 2, Mary – 3, and then again starting 
 * from the first one John – 4, Tom – 5. As Tom gets number 5, he should leave. Now, we have John and Mary and start 
 * counting again. John gets number 5, so he leaves. Thus, the winner is Mary.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. Each line includes a test case with names of players and a number for 
 * a "black spot". Players and a number are separated by a pipeline '|'.
 * For example:
 * John Sara Tom Susan | 3
 * John Tom Mary | 5
 * 
 * OUTPUT SAMPLE:
 * Print the name of a winner.
 * For example:
 * Sara
 * Mary
 * 
 * CONSTRAINTS:
 * Always start counting from the first name in a list.
 * Number of players can be from 3 to 10.
 * Number of turns can be from 3 to 15.
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BlackCard {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_BlackCard.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] parts = line.split("\\|");
			String[] persons = parts[0].trim().split(" ");
			ArrayList<String> listPersons = new ArrayList<String>();
			for (String s : persons)
				listPersons.add(s);
			int num = Integer.parseInt(parts[1].trim());
			while (listPersons.size() > 1) {
				int removeIdx = (num % listPersons.size());
				if (removeIdx == 0)
					removeIdx = listPersons.size();
				listPersons.remove(removeIdx - 1);
			}
			System.out.println(listPersons.get(0));
		}
	}
}
