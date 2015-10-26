/**
 * File Size
 * -----------
 * Print the size of a file in bytes.
 * 
 * INPUT:
 * The first argument to your program has the path to the file you need to check the size of.
 * 
 * OUTPUT SAMPLE:
 * Print the size of the file in bytes. E.g.
 * 55
 */
package com.codeeval.easy;

import java.io.File;
import java.io.IOException;

public class FileSize {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SwapCase.txt");
        System.out.println(file.length());
	}
}
