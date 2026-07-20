package com.rays.string;

public class CountOccurenceOfChar {

	public static void main(String[] args) {
		String name = "Google";
		int count = 0;
		name = name.toLowerCase();
		char ch = 'o';
		for (int i = 0; i < name.length(); i++) {
			if (ch == name.charAt(i)) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println(ch + " " + count);
		}
	}

}
