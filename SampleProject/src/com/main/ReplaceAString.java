// Write a program to search for a string in a file and then replace it with another string.

package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceAString {

	public void  toReplaceAstring(String fileName, String searchString, String replaceString){
		String entireFile = "";
		int count = 0;
		try{
			BufferedReader read = new BufferedReader(new FileReader(fileName));
			String line = read.readLine();
			while(line!=null){
				entireFile = entireFile+System.getProperty("line.separator")+line;
				line = read.readLine();
			}  
			read.close();
			entireFile = entireFile.replace(searchString, replaceString);	
		    BufferedWriter write = new BufferedWriter(new FileWriter(fileName));
		    write.write(entireFile);
		    write.flush();
		    write.close();
			
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		
	
		
	}

}
