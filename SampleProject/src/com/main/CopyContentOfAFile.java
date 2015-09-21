package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyContentOfAFile {

	public void toCopyContent(String inputFileName, String outputFileName){
		String fileContent = "";
		
		try {
			BufferedReader read = new BufferedReader(new FileReader(inputFileName));
			String line = read.readLine();
			while(line!=null){
				fileContent = fileContent+System.getProperty("line.separator")+line;
				line = read.readLine();
			}
			read.close();
			
			BufferedWriter write = new BufferedWriter(new FileWriter(outputFileName));
			write.write(fileContent);
			write.flush();
			write.close();
			
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}
}
