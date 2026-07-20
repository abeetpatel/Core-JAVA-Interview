package com.rays.string;

public class CountNoOfIntFromString {

	public static void main(String[] args) {

		String name = "abeet9854";

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (Character.isDigit(name.charAt(i))) {
				count++;
			}

		}

		System.out.println("NO OF INT FROM STRING => " + count);

	}

}
