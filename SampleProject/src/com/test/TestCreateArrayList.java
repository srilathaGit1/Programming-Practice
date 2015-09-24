package com.test;

import org.testng.annotations.Test;

import com.main.CreateArrayList;

public class TestCreateArrayList {
  @Test
  public void testCreateArrayList() {
	  
	  CreateArrayList createList =  new CreateArrayList();
	  createList.toCreateArrayList();
	  
	  
	  
  }
  
  @Test
  public void testFindAndReverseAnElement(){
	  CreateArrayList listOfArray = new CreateArrayList();
	  listOfArray.findandreverseAnElement();
  }
}
