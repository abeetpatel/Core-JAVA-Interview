package com.rays.string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "raj";
		String s2 = "jar";

		char[] ca1 = s1.toCharArray();
		char[] ca2 = s2.toCharArray();

		System.out.println(ca1);
		System.out.println(ca2);

		Arrays.sort(ca1);
		Arrays.sort(ca2);

		System.out.println(ca1);
		System.out.println(ca2);

		if (Arrays.equals(ca1, ca2)) {

			System.out.println(s1 + " " + s2 + " is Anagram");

		}else {
			System.out.println(s1 + " " + s2 + " is not Anagram");
		}

	}

}
