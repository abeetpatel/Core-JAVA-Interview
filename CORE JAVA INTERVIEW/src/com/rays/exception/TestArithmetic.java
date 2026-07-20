package com.rays.exception;

public class TestArithmetic {

	public static void main(String[] args) {

		int a = 5;
		int c = a / 1;
		System.out.println(c);
		try {
			int d = a / 0;
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.exit(0);
		}finally {
			System.out.println("Finally Block");
		}

	}

}
