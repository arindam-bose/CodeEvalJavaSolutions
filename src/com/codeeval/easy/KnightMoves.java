/**
 * Knight Moves
 * -------------
 * @author adambose1990
 *  
 * CHALLENGE DESCRIPTION:
 * In chess, the knight moves to any of the closest squares that are not on the same rank, file, or diagonal. 
 * Thus the move is in the “L” form: two squares vertically and one square horizontally, or two squares horizontally 
 * and one square vertically:
 * Your task is to find all possible positions for the next move of the knight on the empty chessboard.
 * 
 * INPUT SAMPLE:
 * The first argument is a filename that contains positions of the knight on the chessboard in the CN form, where:
 * C is a letter from “a” to “h” and denotes a column.
 * N is a number from 1 to 8 and denotes a row.
 * Each position is indicated in a new line.
 * For example:
 * g2
 * a1
 * d6
 * e5
 * b1
 * 
 * OUTPUT SAMPLE:
 * Print to stdout all possible positions for the next move of the knight ordered alphabetically.
 * For example:
 * e1 e3 f4 h4
 * b3 c2
 * b5 b7 c4 c8 e4 e8 f5 f7
 * c4 c6 d3 d7 f3 f7 g4 g6
 * a3 c3 d2
 * 
 * CONSTRAINTS:
 * The number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class KnightMoves {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_KnightMoves.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			StringBuffer buff = new StringBuffer();
			char c = line.charAt(0);
			char n = line.charAt(1);
			if ((c > 'b') && (n > '1'))
				buff.append((char)(c-2)).append((char)(n-1)).append(" ");
			if ((c > 'b') && (n < '8'))
				buff.append((char)(c-2)).append((char)(n+1)).append(" ");
			if ((c > 'a') && (n > '2'))
				buff.append((char)(c-1)).append((char)(n-2)).append(" ");
			if ((c > 'a') && (n < '7'))
				buff.append((char)(c-1)).append((char)(n+2)).append(" ");
			if ((c < 'h') && (n > '2'))
				buff.append((char)(c+1)).append((char)(n-2)).append(" ");
			if ((c < 'h') && (n < '7'))
				buff.append((char)(c+1)).append((char)(n+2)).append(" ");
			if ((c < 'g') && (n > '1'))
				buff.append((char)(c+2)).append((char)(n-1)).append(" ");
			if ((c < 'g') && (n < '8'))
				buff.append((char)(c+2)).append((char)(n+1)).append(" ");
			System.out.println(buff.substring(0, buff.length()-1));
		}
	}
}
