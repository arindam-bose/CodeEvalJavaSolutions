package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadMore {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_ReadMore.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            StringBuilder newString = new StringBuilder();
            if (line.length() > 55) {
            	String resultString = line.substring(0, 40).trim();
            	if (resultString.contains(" ")){ 
            		int lastSpace = resultString.lastIndexOf(' ');
            		newString.append(line.substring(0, lastSpace).trim());
            	} else {
            		newString.append(resultString);
            	}
            	newString.append("... <Read More>");
            	line = newString.toString();
            }
            System.out.println(line);
        }
	}
}
