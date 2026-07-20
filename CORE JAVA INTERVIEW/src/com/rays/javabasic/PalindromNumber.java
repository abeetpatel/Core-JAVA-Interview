package com.rays.javabasic;

public class PalindromNumber {

	public static void main(String[] args) {

		int num = 121;

		int num2 = num;

		int r = 0;

		int temp = 0;

		while (num2 != 0) {

			r = num2 % 10;

			temp = temp * 10 + r;

			num2 = num2 / 10;

		}

		if (num == temp) {

			System.out.println(num + " is a palindrom no.");

		} else {

			System.out.println(num + " is not a palindrom no.");

		}
	}

}
