package com.main;

public class StaticMethodAndBlock {

	public StaticMethodAndBlock() {

		System.out.println("step 1");

	}

	static {
		System.out.println("step 2");
	}

	public static void thisIsStaticMethod() {

		System.out.println("step 3");

	}

}
