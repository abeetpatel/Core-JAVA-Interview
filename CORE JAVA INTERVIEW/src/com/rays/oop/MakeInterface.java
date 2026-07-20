package com.rays.oop;

public interface MakeInterface {

	public static final String NAME = "ABEET";
	public int NUM = 1;

	public int sum(int a, int b);
	
	public abstract void demo();

	public static void staticMethod() {
		System.out.println("Static Method");
	}

	public default void defaultMethod() {
		System.out.println("Default Method");
	}

}
