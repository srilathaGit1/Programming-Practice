package com.main;

//Write a program that prints a fibonaci series that is a sequence of numbers like0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you can print 10 numbers or 15 or 20 or any desired number.


public class FibonaciSeries {
	int n;
	int prev1;
	int prev2;

	public  int isFibonaciSeries(int N){
		
		this.n = N;
		prev1 = 0;
		prev2 = 1;
		for(int i =0; i<N; ++i){
			int savprev1=prev1;
			prev1 = prev2;
			prev2 = savprev1+prev1;

		}
		return prev1;

	}
	
	public static int isFibonaciSeries1(int N){
         int prev1 = 0;
         int prev2 = 1;
		for(int i =0; i<N; i++){
			int savprev1=prev1;
			prev1 = prev2;
			prev2 = savprev1+prev1;
		}
		return prev1;
	}



}
