package com.test;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.FindDuplicates;

public class TestFindDuplicates {
  @Test
  public void testFindDuplicates() {
	  
	  Object[] arr = {123,44,454,44};
	  FindDuplicates finding = new FindDuplicates();
	  ArrayList<Object> duplicates = finding.find(arr);
	  Assert.assertEquals(duplicates.get(0), 44);
	  
	  
	  
  }
  
  @Test
  public void negtestFindDuplicates(){
	  Object[] arr = {124,8878,198,124};
	  FindDuplicates finding = new FindDuplicates();
	  ArrayList<Object> duplicates = finding.find(arr);
	  Assert.assertNotEquals(duplicates.get(0), 198);
	  
  }
}
