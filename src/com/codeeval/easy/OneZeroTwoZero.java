package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OneZeroTwoZero {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_OneZeroTwoZero.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int countTotal = 0;
            String[] numStrings = line.split(" ");
            int initCount = Integer.parseInt(numStrings[0]);
            int initRange = Integer.parseInt(numStrings[1]);
            for (int i=1 ; i <= initRange; i++) {
            	int countZero = 0;
            	String binInt = Integer.toString(i, 2);
            	if (binInt.contains("0"))
            		countZero = binInt.length() - binInt.replace("0", "").length();
            	
            	if (countZero == initCount)
            		countTotal++;
            }
            System.out.println(countTotal);
        }
	}
}