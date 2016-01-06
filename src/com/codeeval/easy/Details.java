/**
 * Details
 * --------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * There are two details on a M*N checkered field. The detail X covers several (at least one first cell) cells in each 
 * line. The detail Y covers several (at least one last cell) cells. Each cell is either fully covered with a detail 
 * or not. Also, the details may have cavities (or other complex structures). Please see example below (the detail Y 
 * is one detail):
 * The detail Y starts moving left (without any turn) until it bumps into the X detail at least with one cell. 
 * Determine by how many cells the detail Y will be moved.
 * 
 * INPUT SAMPLE:
 * The first argument is a file with different test cases. Each test case contains a matrix the lines of which are 
 * separated by comma. (Empty cells are marked as ".")
 * For example:
 * XX.YY,XXX.Y,X..YY,XX..Y
 * XXX.YYYY,X...Y..Y,XX..YYYY,X.....YY,XX....YY
 * XX...YY,X....YY,XX..YYY,X..YYYY
 * XXYY,X..Y,XX.Y
 * 
 * OUTPUT SAMPLE:
 * Print out the number of cells the detail Y will be moved.
 * For example:
 * 1
 * 1
 * 2
 * 0
 * 
 * CONSTRAINTS:
 * The matrices can be of different M*N sizes. (2 <= M <= 10, 2 <= N <= 10)
 * Number of test cases is 40.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Details {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_Details.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] lines = line.split(",");
			int result = 10;
			for (int i = 0; i < lines.length; i++) {
				int total = 0;
				for (int j = 0; j < lines[i].length(); j++) {
					if ((lines[i].charAt(j) == '.')
							&& ((lines[i].charAt(j - 1) == 'X') || (lines[i].charAt(j - 1) == '.'))) {
						total++;
					}
				}
				if (total < result) {
					result = total;
				}
			}
			System.out.println(result);
		}
	}
}
