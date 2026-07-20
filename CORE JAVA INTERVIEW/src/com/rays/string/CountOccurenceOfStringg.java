package com.rays.string;

public class CountOccurenceOfStringg {

	public static void main(String[] args) {

		String name = "Abeet Patel";
		name = name.toLowerCase();
		String[] s = name.split(" ");
		int count = 0;
		for (char ch = 'a'; ch < 'z'; ch++) {
			for (String a : s) {
				for (int i = 0; i < a.length(); i++) {
					if (ch == a.charAt(i)) {
						count++;
					}
				}
			}
			if (count != 0) {
				System.out.println(ch + " " + count);
			}
			count = 0;
		}
	}

}
