package com.rays.string;

public class ReplaceChar {
	public static void main(String[] args) {

		String name = "Abeet Patel";
		name = name.toLowerCase();
		char ch = 't';
		String s = "";
		for (int i = 0; i < name.length(); i++) {

			if (ch == name.charAt(i)) {
				s += 'k';
			} else {
				s += name.charAt(i);
			}

		}
		System.out.println(s);
	}

}
