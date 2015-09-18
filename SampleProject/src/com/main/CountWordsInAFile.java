package com.main;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountWordsInAFile {
	
	public int toCountWordsFromFile(String pFileName){
		String wordsFromFile = "";
		int count1 =0;
		try{
		BufferedReader read = new BufferedReader(new FileReader(pFileName));
		
		 String line = read.readLine();
		 while(line!=null){

			 wordsFromFile = wordsFromFile +System.getProperty("line.separator")+line;
			 line = read.readLine();
			 
		 }
		 read.close();
		 String[] count = wordsFromFile.split(" ");
		 for(int i =0; i<count.length;i++){
			 count1++;
		 }
		 
		 
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		return count1;
		
	}

}
