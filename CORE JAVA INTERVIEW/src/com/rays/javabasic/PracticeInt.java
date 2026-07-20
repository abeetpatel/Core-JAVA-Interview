package com.rays.javabasic;

@FunctionalInterface
public interface PracticeInt {

	public int sum(int a, int b);
	

	public static void sub(int a, int b) {
		System.out.println(a - b);
	}

	public static void div(int a, int b) {
		System.out.println(a / b);
	}

	public default void multi(int a, int b) {
		System.out.println(a * b);
	}

	public default void rem(int a, int b) {
		System.out.println(a % b);
	}
}
