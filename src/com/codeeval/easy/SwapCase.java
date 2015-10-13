/*Write a program which swaps letters' case in a sentence. All non-letter characters should remain the same.

INPUT SAMPLE:
Your program should accept as its first argument a path to a filename. Input example is the following
Hello world!
JavaScript language 1.8
A letter

OUTPUT SAMPLE:
Print results in the following way.
hELLO WORLD!
jAVAsCRIPT LANGUAGE 1.8
a LETTER
*/
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SwapCase {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SwapCase.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char[] charArray = line.toCharArray();
            for (int i = 0; i < charArray.length; i++) {
            	if (charArray[i] >= 65 && charArray[i] <= 90) 
            		charArray[i] = (char) (charArray[i] + 32);
            	else if (charArray[i] >= 97 && charArray[i] <= 122) 
            		charArray[i] = (char) (charArray[i] - 32);
            }
            String outLine = new String(charArray);
            System.out.println(outLine);
        }
	}
}
