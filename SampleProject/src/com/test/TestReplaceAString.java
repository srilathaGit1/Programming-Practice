package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ReplaceAString;

public class TestReplaceAString {
  @Test
  public void testToReplaceAString()  {
	  
	  String str = "C:\\testing\\testing code.txt";
	  String searchWord = "testing";
	  String replaceWord = "testing1";
	  ReplaceAString replace = new ReplaceAString();
	  replace.toReplaceAstring(str, searchWord, replaceWord);
	  String entireFile = "";
	  try{
			BufferedReader read = new BufferedReader(new FileReader(str));
			String line = read.readLine();
			while(line!=null){
				entireFile = entireFile+System.getProperty("line.separator")+line;
				line = read.readLine();
			}  
			read.close();
	  }
	  catch(Exception ex){
		  ex.printStackTrace();
		  
	  }
	
	  if(entireFile.indexOf("testing1")>=0){
		  Assert.assertTrue(true);
	  }
	  else{
	  Assert.assertTrue(false);
	  }
  } 
}
