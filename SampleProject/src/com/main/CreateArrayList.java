package com.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class CreateArrayList {
	public void toCreateArrayList(){
		ArrayList<String> addList = new ArrayList<String>();
		addList.add("adding a string");
		addList.add("this is another string");
		int result = addList.size();
		System.out.println(result);
		Iterator it = addList.iterator();
		while(it.hasNext()){
			String print = (String)it.next();
			System.out.println(print);
		}
		
		
		
		
		
	}
	
	public void findandreverseAnElement(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		boolean result = list.contains(3);
		System.out.println(result);
	  ListIterator<Integer> list2 = list.listIterator(list.size());
	  while(list2.hasPrevious()){
		  System.out.println(list2.previous());
	  }
		
	}

}
