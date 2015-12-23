/**
 * Morse Code
 * ------------
 * CHALLENGE DESCRIPTION:
 * You have received a text encoded with Morse code and want to decode it.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following:
 * .- ...- ..--- .-- .... .. . -.-. -..-  ....- .....
 * -... .... ...--
 * Each letter is separated by space char, each word is separated by 2 space chars.
 * 
 * OUTPUT SAMPLE:
 * Print out decoded words. E.g.
 * AV2WHIECX 45
 * BH3
 * You program has to support letters and digits only.
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/Arindam/workspaceCodeEval/CodeEvalJavaSolutions/files/test_MorseCode.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] codes = line.split(" ");
            StringBuffer buff = new StringBuffer();
            for (String s : codes) {
            	if (s.equals(""))
            		buff.append(" ");
            	else
            		buff.append(getWordFromLibrary(s));
            }
            System.out.println(buff);
        }
	}
	private static String getWordFromLibrary(String key) {
		Map<String, String> library = new HashMap<String, String>();
		library.put(".-", "A");
		library.put("-...", "B");
		library.put("-.-.", "C");
		library.put("-..", "D");
		library.put(".", "E");
		library.put("..-.", "F");
		library.put("--.", "G");
		library.put("....", "H");
		library.put("..", "I");
		library.put(".---", "J");
		library.put("-.-", "K");
		library.put(".-..", "L");
		library.put("--", "M");
		library.put("-.", "N");
		library.put("---", "O");
		library.put(".--.", "P");
		library.put("--.-", "Q");
		library.put(".-.", "R");
		library.put("...", "S");
		library.put("-", "T");
		library.put("..-", "U");
		library.put("...-", "V");
		library.put(".--", "W");
		library.put("-..-", "X");
		library.put("-.--", "Y");
		library.put("--..", "Z");
		
		library.put(".----", "1");
		library.put("..---", "2");
		library.put("...--", "3");
		library.put("....-", "4");
		library.put(".....", "5");
		library.put("-....", "6");
		library.put("--...", "7");
		library.put("---..", "8");
		library.put("----.", "9");
		library.put("-----", "0");
		
		return library.get(key);
	}
}
