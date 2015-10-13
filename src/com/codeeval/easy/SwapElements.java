package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class SwapElements {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SwapElements.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
        	StringBuilder builder = new StringBuilder();
            line = line.trim();
            String[] parts = line.split(":");
            String[] arrStr = parts[0].trim().split(" ");
            String[] swapDistances = parts[1].trim().split(",");
            for(int i = 0; i < swapDistances.length; i++) {
            	String[] distance = swapDistances[i].trim().split("-");
            	int start = Integer.parseInt(distance[0]);
            	int end = Integer.parseInt(distance[1]);
            	String temp = arrStr[start];
            	arrStr[start] = arrStr[end];
            	arrStr[end] = temp;
            }
            for (int i = 0; i < arrStr.length; i++) {
				builder.append(arrStr[i]).append(" ");
			}
            builder.setLength(builder.length()-1);
        	System.out.println(builder);
        }
	}

}
