package com.codeeval.moderate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReverseandAdd {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_ReverseandAdd.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int count = 0;
            do {
            	count++;
            	StringBuilder revLine = new StringBuilder(line).reverse();
            	long sum = Long.parseLong(line) + Long.parseLong(revLine.toString());
            	line = Long.toString(sum);
            } while (!isPalindrome(line));
            System.out.println(count + " " + line);
        }
	}
	
	public static boolean isPalindrome (String line) {
		boolean flag = true;
		char[] charArray = line.toCharArray();
		for (int i = 0; i < charArray.length/2; i++) {
			if (charArray[i] != charArray[charArray.length - i - 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
