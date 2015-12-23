/**
 * Matrix Rotation
 * ----------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You are given a 2D N×N matrix. Each element of the matrix is a letter: from ‘a’ to ‘z’. Your task is 
 * to rotate the matrix 90° clockwise:
 * a b c        g d a
 * d e f  =>    h e b
 * g h i        i f c
 * 
 * INPUT SAMPLE:
 * The first argument is a file that contains 2D N×N matrices, presented in a serialized form (starting 
 * from the upper-left element), one matrix per line. The elements of a matrix are separated by spaces.
 * For example:
 * a b c d
 * a b c d e f g h i j k l m n o p
 * a b c d e f g h i
 * 
 * OUTPUT SAMPLE:
 * Print to stdout matrices rotated 90° clockwise in a serialized form (same as in the input sample).
 * For example:
 * c a d b
 * m i e a n j f b o k g c p l h d
 * g d a h e b i f c
 * 
 * CONSTRAINTS:
 * The N size of the matrix can be from 1 to 10
 * The number of test cases is 100
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MatrixRotation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_MatrixRotation.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] elements = line.split(" ");
			String[][] eMatrix = getMatrix(elements);
			String[][] revMatrix = getReverseMatrix(eMatrix);
			System.out.println(getFinalString(revMatrix));
		}
	}

	private static String[][] getMatrix(String[] elements) {
		int num = (int) Math.sqrt(elements.length);
		String[][] eMatrix = new String[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				eMatrix[i][j] = elements[num * i + j];
			}
		}
		return eMatrix;
	}

	private static String[][] getReverseMatrix(String[][] eMatrix) {
		int num = eMatrix.length;
		String[][] tempMatrix = new String[num][num];
		for (int i = 0; i < num; i++) {
			tempMatrix[i] = eMatrix[num - i - 1];
		}

		String[][] revMatrix = new String[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				revMatrix[i][j] = tempMatrix[j][i];
			}
		}
		return revMatrix;
	}

	private static String getFinalString(String[][] revMatrix) {
		StringBuffer buffer = new StringBuffer();
		int num = revMatrix.length;
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				buffer.append(revMatrix[i][j]).append(" ");
			}
		}
		return buffer.substring(0, buffer.length() - 1).toString();
	}
}
