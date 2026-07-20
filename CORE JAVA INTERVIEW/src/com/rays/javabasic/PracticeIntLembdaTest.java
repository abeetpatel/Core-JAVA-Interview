package com.rays.javabasic;

public class PracticeIntLembdaTest {

	public static void main(String[] args) {

		PracticeInt p = (a, b) -> {

			return (a + b);

		};

		int a = 20;
		int b = 10;
		System.out.println(p.sum(a, b));
		PracticeInt.sub(a, b);
		p.multi(a, b);

	}

}
