package com.rays.string;

public class StringMethods {

	public static void main(String[] args) {

		String name = "Abeet";
		String str = " Patel";

		System.out.println("String Length = " + name.length());
		System.out.println("UpperCase = " + name.toUpperCase());
		System.out.println("LowerCase = " + name.toLowerCase());
		System.out.println("StartWith = " + name.startsWith("M"));
		System.out.println("EndWith = " + name.endsWith("t"));
		System.out.println("CharAt = " + name.charAt(0));
		System.out.println("IndexOf = " + name.indexOf("e"));
		System.out.println("LastIndexOf = " + name.lastIndexOf("e"));
		System.out.println("SubString = " + name.substring(1));
		System.out.println("Trim = " + name.trim());
		System.out.println("Concat = " + name.concat(str));
		System.out.println("Replace = " + name.replace("Ab", "Pr"));

		String str1 = "hellow java";
		String[] s = str1.split(" "); // split space ke hisab se string ko tod deta h
		for (String s1 : s) {
			System.out.print(s1);
			System.out.print(" ");
		}

		System.out.println("........................");

		String s3 = "SUNRAYS";
		String s4 = "SUNRAYS";

		String s5 = new String("SUNRAYS");
		String s6 = new String("SUNRAYS");

		boolean b = (s3 == s4);
		System.out.println(b);
		boolean p = s3.equals(s4);
		System.out.println(p);
		boolean c = (s3 == s5);
		System.out.println(c);
		boolean d = s3.equals(s5);
		System.out.println(d);
	}

}
