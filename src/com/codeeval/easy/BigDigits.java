/**
 * Big Digits
 * -----------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * In this challenge you're presented with a situation in which you need to output big symbols on devices which 
 * only support ASCII characters and single, fixed-width fonts. To do this you're going to use pseudo-graphics 
 * to 'draw' these big symbols.
 * Here is an example of the font with digits from 0 to 9:
 * -**----*--***--***---*---****--**--****--**---**--
 * *--*--**-----*----*-*--*-*----*-------*-*--*-*--*-
 * *--*---*---**---**--****-***--***----*---**---***-
 * *--*---*--*-------*----*----*-*--*--*---*--*----*-
 * -**---***-****-***-----*-***---**---*----**---**--
 * --------------------------------------------------
 * Each pixel is marked either with asterisk ‘*’ or with minus ‘-’. Size of a digit is 5×6 pixels.
 * 
 * Your task is to write a program, which outputs the numbers given to you with the font as in the example.
 * 
 * INPUT SAMPLE:
 * The first argument is a file that contains the lines with digits sequences you need to magnify. E.g.:
 * 3.1415926
 * 1.41421356
 * 01-01-1970
 * 2.7182818284
 * 4 8 15 16 23 42
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the magnified digits:
 * ***----*---*-----*--****--**--***---**--
 * ---*--**--*--*--**--*----*--*----*-*----
 * -**----*--****---*--***---***--**--***--
 * ---*---*-----*---*-----*----*-*----*--*-
 * ***---***----*--***-***---**--****--**--
 * ----------------------------------------
 * --*---*-----*---*---***----*--***--****--**--
 * -**--*--*--**--*--*----*--**-----*-*----*----
 * --*--****---*--****--**----*---**--***--***--
 * --*-----*---*-----*-*------*-----*----*-*--*-
 * -***----*--***----*-****--***-***--***---**--
 * ---------------------------------------------
 * -**----*---**----*----*---**--****--**--
 * *--*--**--*--*--**---**--*--*----*-*--*-
 * *--*---*--*--*---*----*---***---*--*--*-
 * *--*---*--*--*---*----*-----*--*---*--*-
 * -**---***--**---***--***--**---*----**--
 * ----------------------------------------
 * ***--****---*---**--***---**----*---**--***---**---*---
 * ---*----*--**--*--*----*-*--*--**--*--*----*-*--*-*--*-
 * -**----*----*---**---**---**----*---**---**---**--****-
 * *-----*-----*--*--*-*----*--*---*--*--*-*----*--*----*-
 * ****--*----***--**--****--**---***--**--****--**-----*-
 * -------------------------------------------------------
 * -*----**----*--****---*---**--***--***---*---***--
 * *--*-*--*--**--*-----**--*-------*----*-*--*----*-
 * ****--**----*--***----*--***---**---**--****--**--
 * ---*-*--*---*-----*---*--*--*-*-------*----*-*----
 * ---*--**---***-***---***--**--****-***-----*-****-
 * --------------------------------------------------
 * 
 * CONSTRAINTS:
 * Input lines are up to 16 symbols long.
 * Input can contain some other symbols, which should be ignored (i.e. points, hyphens, spaces); only 
 * numbers must be printed out.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BigDigits {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_BigDigits.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			StringBuffer[] finalString = new StringBuffer[6];
			for (int i = 0; i < 6; i++)
				finalString[i] = new StringBuffer();
			for (int i = 0; i < line.length(); i++) {
				if ((line.charAt(i) >= 48) && (line.charAt(i) <= 57)) {
					String[] incomingString = getLibrary(Integer.parseInt(Character.toString(line.charAt(i))));
					for (int j = 0; j < 6; j++)
						finalString[j].append(incomingString[j]);
				}
			}
			for (int i = 0; i < finalString.length; i++)
				System.out.println(finalString[i]);
		}
	}

	private static String[] getLibrary(int num) {
		String[] library = new String[6];
		switch (num) {
		case 0:
			library[0] = new String("-**--");
			library[1] = new String("*--*-");
			library[2] = new String("*--*-");
			library[3] = new String("*--*-");
			library[4] = new String("-**--");
			library[5] = new String("-----");
			break;
		case 1:
			library[0] = new String("--*--");
			library[1] = new String("-**--");
			library[2] = new String("--*--");
			library[3] = new String("--*--");
			library[4] = new String("-***-");
			library[5] = new String("-----");
			break;
		case 2:
			library[0] = new String("***--");
			library[1] = new String("---*-");
			library[2] = new String("-**--");
			library[3] = new String("*----");
			library[4] = new String("****-");
			library[5] = new String("-----");
			break;
		case 3:
			library[0] = new String("***--");
			library[1] = new String("---*-");
			library[2] = new String("-**--");
			library[3] = new String("---*-");
			library[4] = new String("***--");
			library[5] = new String("-----");
			break;
		case 4:
			library[0] = new String("-*---");
			library[1] = new String("*--*-");
			library[2] = new String("****-");
			library[3] = new String("---*-");
			library[4] = new String("---*-");
			library[5] = new String("-----");
			break;
		case 5:
			library[0] = new String("****-");
			library[1] = new String("*----");
			library[2] = new String("***--");
			library[3] = new String("---*-");
			library[4] = new String("***--");
			library[5] = new String("-----");
			break;
		case 6:
			library[0] = new String("-**--");
			library[1] = new String("*----");
			library[2] = new String("***--");
			library[3] = new String("*--*-");
			library[4] = new String("-**--");
			library[5] = new String("-----");
			break;
		case 7:
			library[0] = new String("****-");
			library[1] = new String("---*-");
			library[2] = new String("--*--");
			library[3] = new String("-*---");
			library[4] = new String("-*---");
			library[5] = new String("-----");
			break;
		case 8:
			library[0] = new String("-**--");
			library[1] = new String("*--*-");
			library[2] = new String("-**--");
			library[3] = new String("*--*-");
			library[4] = new String("-**--");
			library[5] = new String("-----");
			break;
		case 9:
			library[0] = new String("-**--");
			library[1] = new String("*--*-");
			library[2] = new String("-***-");
			library[3] = new String("---*-");
			library[4] = new String("-**--");
			library[5] = new String("-----");
			break;
		}
		return library;
	}
}
