package com.rays.javabasic;

public class SecondHighestByLogic {

	public static void main(String[] args) {

		int[] arr = { 5, 36, 4, 28, 1 };
		int h = 0;
		int sh = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > h) {

				sh = h;
				h = arr[i];
			}
			if (sh < arr[i] && h > arr[i]) {
				sh = arr[i];
			}
		}
		System.out.println(sh);
	}

}
