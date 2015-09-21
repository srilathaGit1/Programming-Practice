package com.test;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CopyContentOfAFile;

public class TestCopyContentOfAFile {
  @Test
  public void copyContentOfFile() {
	  String inputFile = "C:\\latha\\NewText.txt";
	  String outputFile = "C:\\latha\\NewTextCopy.txt";
	  CopyContentOfAFile content = new CopyContentOfAFile();
	  content.toCopyContent(inputFile, outputFile );
	  File file= new File(outputFile);
	  Assert.assertTrue(file.exists());
	  
	  
	  
  }
}
