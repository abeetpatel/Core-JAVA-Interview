package com.rays.javabasic;

public class FoundeIndexOfInt {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 3 };

		int num = 3;

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			if (num == arr[i]) {

				System.out.println(i);

				count++;
			}

		}

		if (count == 0) {
			System.out.println(-1);
		}

	}
}
