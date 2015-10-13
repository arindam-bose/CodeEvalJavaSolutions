package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SwapNumbers {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SwapNumbers.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            StringBuilder changed= new StringBuilder() ;
        	String[] words = line.split(" ");
        	for (int i = 0; i < words.length; i++) {
				String word = words[i];
				if (word.charAt(0) != word.charAt(word.length()-1)) {
					char[] charArray = word.toCharArray();
					char temp = charArray[0];
					charArray[0] = charArray[charArray.length-1];
					charArray[charArray.length-1] = temp;
					words[i] = new String(charArray);
				}
				changed.append(words[i]).append(" ");
			}
        	changed.setLength(changed.length()-1);
        	System.out.println(changed);
        }
	}
}
