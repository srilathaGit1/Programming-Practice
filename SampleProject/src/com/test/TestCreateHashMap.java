package com.test;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.main.CreateHashMap;

public class TestCreateHashMap {
  @Test
  public void findHashMapKey() {
	  HashMap myMap = new HashMap();
	  myMap.put(1, "Student");
	  myMap.put(2, "Employee");
	  myMap.put(3, "trainee");
	  CreateHashMap hashMap = new CreateHashMap();
	  String  result = hashMap.searchKey(myMap, 1);
	  System.out.println(result);
	  
	  
	  
	  
  }
}
