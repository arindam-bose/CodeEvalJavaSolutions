/**
 * Delta Time
 * -----------
 * @author adambose1990
 * 
 * CHALLENGE DESCRIPTION:
 * You are given the pairs of time values. The values are in the HH:MM:SS format with leading zeros. 
 * Your task is to find out the time difference between the pairs.
 * 
 * INPUT SAMPLE:
 * The first argument is a file that contains lines with the time pairs.
 * For example:
 * 14:01:57 12:47:11
 * 13:09:42 22:16:15
 * 08:08:06 08:38:28
 * 23:35:07 02:49:59
 * 14:31:45 14:46:56
 * 
 * OUTPUT SAMPLE:
 * Print to stdout the time difference for each pair, one per line. You must format the time values in 
 * HH:MM:SS with leading zeros.
 * For example:
 * 01:14:46
 * 09:06:33
 * 00:30:22
 * 20:45:08
 * 00:15:11
 */
package com.codeeval.easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DeltaTime {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException, ParseException {
		File file = new File("files/easy/test_DeltaTime.txt");
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String[] times = line.split(" ");
			SimpleDateFormat dtf = new SimpleDateFormat("HH:mm:ss");
			Date startDate = dtf.parse(times[0]);
			Date endDate = dtf.parse(times[1]);
			long diff = Math.abs(startDate.getTime() - endDate.getTime());
			long diffSeconds = diff / 1000 % 60;
			long diffMinutes = diff / (60 * 1000) % 60;
			long diffHours = diff / (60 * 60 * 1000) % 24;
			StringBuffer buff = new StringBuffer();
			buff.append(diffHours < 10 ? "0" + diffHours : diffHours).append(":");
			buff.append(diffMinutes < 10 ? "0" + diffMinutes : diffMinutes).append(":");
			buff.append(diffSeconds < 10 ? "0" + diffSeconds : diffSeconds);
			System.out.println(buff);
		}
	}
}
