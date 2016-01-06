/**
 * JSON Menu IDs
 * --------------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You have JSON string which describes a menu. Calculate the SUM of IDs of all "items" in the case a "label" 
 * exists for an item.
 * 
 * INPUT SAMPLE:
 * Your program should accept as its first argument a path to a filename. Input example is the following
 * {"menu": {"header": "menu", "items": [{"id": 27}, {"id": 0, "label": "Label 0"}, null, {"id": 93}, {"id": 85}, {"id": 54}, null, {"id": 46, "label": "Label 46"}]}}
 * {"menu": {"header": "menu", "items": [{"id": 81}]}}
 * {"menu": {"header": "menu", "items": [{"id": 70, "label": "Label 70"}, {"id": 85, "label": "Label 85"}, {"id": 93, "label": "Label 93"}, {"id": 2}]}}
 * All IDs are integers between 0 and 100. It can be 10 items maximum for a menu.
 * 
 * OUTPUT SAMPLE:
 * Print results in the following way.
 * 46
 * 0
 * 248
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JSONMenuIDs {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("files/easy/test_JSONMenuIDs.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim().substring(38, line.length() - 3);
			Pattern p = Pattern.compile("\\{(.*?)\\}");
			Matcher m = p.matcher(line);
			int sum = 0;
			while (m.find()) {
				String[] attribs = m.group(1).trim().split(",");
				if (attribs.length == 2 && attribs[1].contains("label")) {
					if (attribs[0].contains("id")) {
						String[] ids = attribs[0].trim().split(":");
						sum += Integer.parseInt(ids[1].trim());
					}
				}
			}
			System.out.println(sum);
		}
	}
}
