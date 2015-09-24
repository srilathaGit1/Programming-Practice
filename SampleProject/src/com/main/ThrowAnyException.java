package com.main;

public class ThrowAnyException {

	public void method1() throws Exception {
		try {
			this.method2();
			this.method3();
		} catch (Exception e) {
		}
		finally {
			System.out.println("Came here finally");
		}
	}

	public void method2() throws Exception {
		int i = 1 / 0;
	}
	
	public void method3() throws Exception{
		String str = null;
		
	}

}
