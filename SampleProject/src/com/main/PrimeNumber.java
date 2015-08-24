package com.main;

public class PrimeNumber {
	int divPrime;

	public boolean isPrime(int pdivPrime){
	   this.divPrime = pdivPrime;
	   for(int i=2; i<pdivPrime; i++){
		   if(pdivPrime%i == 0){
			   return false;
		   }
		 
	   }
	return true;
   }
	
	public static boolean isPrime1(int pdivPrime){

		   for(int i=2; i<pdivPrime; i++){
			   if(pdivPrime%i == 0){
				   return false;
			   }
		   }
		return true;
		
	}
}
