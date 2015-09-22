package com.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.CopyArrayListToArray;

public class NewTest {

	    @Test
	    public void testCopiedArray() {
	  	  
	  	  ArrayList<String> arrayList = new ArrayList<String>();
	  	  arrayList.add("abc");
	  	  arrayList.add("bcd");
	  	  arrayList.add("cd");
	  	  CopyArrayListToArray array = new CopyArrayListToArray();
	  	  String[] copiedArray = array.toCopyArrayList(arrayList);
	   	  Assert.assertEquals(copiedArray[0], "abc");
	  	  
  }
	    
      @Test
         public void negtestCopiedArray() {
	  	  
	  	  ArrayList<String> arrayList = new ArrayList<String>();
	  	  arrayList.add("abc");
	  	  arrayList.add("bcd");
	  	  arrayList.add("cd");
	  	  CopyArrayListToArray array = new CopyArrayListToArray();
	  	  String[] copiedArray = array.toCopyArrayList(arrayList);
	   	  Assert.assertNotEquals(copiedArray[1], "abc");
	  	  
  }
      
}
