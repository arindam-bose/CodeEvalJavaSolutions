/**
 * Reverse Words
 * ---------------
 * CHALLENGE DESCRIPTION:
 * Write a program which reverses the words in an input sentence.
 * 
 * INPUT SAMPLE:
 * The first argument is a file that contains multiple sentences, one per line. Empty lines are also possible.
 * For example:
 * Hello World
 * Hello CodeEval
 * 
 * OUTPUT SAMPLE:
 * Print to stdout each sentence with the reversed words in it, one per line. Empty lines in the input should be ignored. 
 * Ensure that there are no trailing empty spaces in each line you print.
 * For example:
 * World Hello
 * CodeEval Hello
 */

package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_ReverseWords.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] words = line.split(" ");
            StringBuffer buff = new StringBuffer();
            for (int i = words.length - 1; i >= 0; i--) {
            	buff.append(words[i]).append(" ");
            }
            System.out.println(buff.substring(0, buff.length()-1));
        }
	}

}
