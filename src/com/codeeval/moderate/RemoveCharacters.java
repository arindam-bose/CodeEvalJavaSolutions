package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RemoveCharacters {

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
