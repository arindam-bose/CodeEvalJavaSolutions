/*CHALLENGE DESCRIPTION:
You are given a text. Write a program which outputs its lines according to the following rules:
If line length is <= 55 characters, print it without any changes.
If the line length is > 55 characters, change it as follows:
Trim the line to 40 characters.
If there are spaces ‘ ’ in the resulting string, trim it once again to the last space (the space should be trimmed too).
Add a string ‘... <Read More>’ to the end of the resulting string and print it.

INPUT SAMPLE:
The first argument is a file. The file contains a text.
For example:
Tom exhibited.
Amy Lawrence was proud and glad, and she tried to make Tom see it in her 
face - but he wouldn't look.
Tom was tugging at a button-hole and looking sheepish.
Two thousand verses is a great many - very, very great many.
Tom's mouth watered for the apple, but he stuck to his work.

OUTPUT SAMPLE:
Print to stdout the text lines with their length limited according to the rules described above.
For example:
Tom exhibited.
Amy Lawrence was proud and glad, and... <Read More>
Tom was tugging at a button-hole and looking sheepish.
Two thousand verses is a great many -... <Read More>
Tom's mouth watered for the apple, but... <Read More>

CONSTRAINTS:
The maximum length of a line in the input file is 300 characters.
There cannot be more than one consequent space character in the input data.
*/
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
