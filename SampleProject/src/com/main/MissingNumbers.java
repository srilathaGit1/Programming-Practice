package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MissingNumbers {

	public ArrayList<Integer> missing(int[] parr) {

		FindLargestNumber large = new FindLargestNumber();
		int max = large.findMax(parr);
		int min = large.findMin(parr);
		ArrayList<Integer> miss = new ArrayList<Integer>();

		for (int i = min; i < max; i++) {
			boolean exists = false;
			for (int j = 0; j < parr.length; j++) {
				if ((parr[j] == i)) {
					exists = true;
				}
			}
			if(!exists){
			miss.add(i);
			System.out.println(i);
			}
		}
		return miss;

	}

}
