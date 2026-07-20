package com.rays.javabasic;

public class FirstHighest {

	public static void main(String[] args) {

		int[] arr = { 5, 30, 52, 24, 10 };

		int h = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > h) {

				h = arr[i];

			}

		}
		System.out.println(h);

	}

}
