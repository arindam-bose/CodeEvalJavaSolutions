/** 
 * Remove Characters
 * ------------------
 * Write a program which removes specific characters from a string.
 * 
 * INPUT SAMPLE:
 * The first argument is a path to a file. The file contains the source strings and the characters that need to 
 * be scrubbed. Each source string and characters you need to scrub are delimited by comma.
 * For example:
 * how are you, abc
 * hello world, def
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the scrubbed strings, one per line. Ensure that there are no trailing empty spaces on each 
 * line you print.
 * For example:
 * how re you
 * hllo worl
 */
package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RemoveCharacters {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_RemoveCharacters.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] words = line.split(",");
            for (int i = 0; i < words[1].trim().length(); i++) {
            	words[0] = words[0].replaceAll(Character.toString(words[1].trim().charAt(i)), "");
            }
            System.out.println(words[0]);
        }
	}
}
