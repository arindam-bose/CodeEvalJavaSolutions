package com.codeeval.easy;

import java.io.File;
import java.io.IOException;

public class FileSize {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_SwapCase.txt");
        System.out.println(file.length());
	}
}
