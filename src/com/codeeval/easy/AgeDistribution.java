/**
 * Age Distribution
 * -----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You're responsible for providing a demographic report for your local school district based on age. 
 * To do this, you're going determine which 'category' each person fits into based on their age.
 * The person's age will determine which category they should be in:
 * If they're from 0 to 2 the child should be with parents print : 'Still in Mama's arms' 
 * If they're 3 or 4 and should be in preschool print : 'Preschool Maniac' 
 * If they're from 5 to 11 and should be in elementary school print : 'Elementary school' 
 * From 12 to 14: 'Middle school' 
 * From 15 to 18: 'High school' 
 * From 19 to 22: 'College'
 * From 23 to 65: 'Working for the man' 
 * From 66 to 100: 'The Golden Years' 
 * If the age of the person less than 0 or more than 100 - it might be an alien - print: "This program is for humans"
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Each line of input contains one 
 * integer - age of the person:
 * 0
 * 19
 * 
 * OUTPUT SAMPLE:
 * For each line of input print out where the person is:
 * Still in Mama's arms
 * College
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class AgeDistribution {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_AgeDistribution.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			int age = Integer.parseInt(line);
			if (age < 0 || age > 100)
				System.out.println("This program is for humans");
			else if (age > 65)
				System.out.println("The Golden Years");
			else if (age > 22)
				System.out.println("Working for the man");
			else if (age > 18)
				System.out.println("College");
			else if (age > 14)
				System.out.println("High school");
			else if (age > 11)
				System.out.println("Middle school");
			else if (age > 4)
				System.out.println("Elementary school");
			else if (age > 2)
				System.out.println("Preschool Maniac");
			else
				System.out.println("Still in Mama's arms");
		}
	}
}
