package com.rays.javabasic;

public class PracticeIntTest {

	PracticeInt p = new PracticeInt() {

		@Override
		public int sum(int a, int b) {
			return (a + b);
		}
	};

	public static void main(String[] args) {

		int a = 20;
		int b = 10;

		PracticeInt.sub(a, b);

	}

}
