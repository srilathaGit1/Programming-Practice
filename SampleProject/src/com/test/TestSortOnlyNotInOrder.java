package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.main.SortOnlyNotInOrder;

public class TestSortOnlyNotInOrder {
  @Test
  
	  public void testNotSortedElements() {
		  int[] swap = {22,67,32};
		  SortOnlyNotInOrder sort = new SortOnlyNotInOrder();
		  int[] result = sort.unSortedElements(swap);
		  for(int i=0; i<swap.length; i++){
			  System.out.println(result[i]);
			  
		  }
		  Assert.assertEquals(result[1], 32);
		  
	  }
  @Test
  
  public void negTestNotSortedElements(){
	  int[] swap = {34,56,45};
	  SortOnlyNotInOrder sort = new SortOnlyNotInOrder();
	  int[] result = sort.unSortedElements(swap);
	  for(int i=0; i<swap.length; i++){
		 System.out.println(result[i]); 
	  }
	  Assert.assertNotEquals(result[1], 56);
  }
	

  }

