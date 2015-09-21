package com.test;

import java.nio.file.Path;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.ListOfFileNames;

public class TestListOfFileNames {
  @Test
  public void testForListOfFileNames() {
	  String  folder = "C:\\Windows";
	  ListOfFileNames files = new ListOfFileNames();
	  ArrayList<String> files1 = files.toListAllFiles(folder);
	  Assert.assertEquals(files1.size(), 37);
	  
  }
  
  @Test
  
  public void negTestForListOfFiles(){
	  String folder = "c:\\Windows";
	  ListOfFileNames files = new ListOfFileNames();
	  ArrayList<String>files1 = files.toListAllFiles(folder);
	  Assert.assertNotEquals(files1.size(), 39);
  }
}
