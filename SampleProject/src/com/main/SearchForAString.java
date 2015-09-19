package com.main;

import java.io.BufferedReader;
import java.io.FileReader;

public class SearchForAString {

	public int isSearchForString(String fileName, String word) {
		String entireFile = "";
		int count = 0;
		try {
			BufferedReader read = new BufferedReader(new FileReader(fileName));
			String line = read.readLine();
			while (line != null) {
				entireFile = entireFile + System.getProperty("line.serparator") + line;
				line = read.readLine();
			}
			read.close();
			String[] allWords = entireFile.split(" ");
			for (int i = 0; i < allWords.length; i++) {
				if (allWords[i].contains(word)) {
					count++;
				}
			}

		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return count;
	}
}
