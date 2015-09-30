package com.main;

public class StaticMethodAndBlock {
	
	
public StaticMethodAndBlock(){
	
    	
       	System.out.println("step 1" );
    	
    }
   

   
  

	static{
    	System.out.println("step 2");
    }
    
	
	public static int thisIsStaticMethod(int N){      
	int prev1 = 0;
    int prev2 = 1;
   
	for(int i =0; i<N; i++){
		int savprev1=prev1;
		prev1 = prev2;
		prev2 = savprev1+prev1;
	}
	return  prev1;
	
}
	
		
	}


