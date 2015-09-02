package com.main;

public class PrintApattern {
	
	int P, Q ;
	public void isPrintPattern(){
		for(int P=0; P<=10; P++){
			for(int Q =1; Q<=P; Q++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
