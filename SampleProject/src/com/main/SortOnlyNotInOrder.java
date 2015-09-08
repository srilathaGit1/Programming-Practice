package com.main;

public class SortOnlyNotInOrder {

	public int[] unSortedElements(int[] parr) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int i = parr.length-1; i > 0; i--)
				if (parr[i] < parr[i - 1]) {
					
					int j = i-1;
					while (j >= 0 ){
						if (parr[i] < parr[j]){
							
							int temp = parr[j];
							parr[j]=parr[i];
							parr[i] = temp;
							break;
						}
						j--;

					}
				}

		}

	return parr;
}

}
