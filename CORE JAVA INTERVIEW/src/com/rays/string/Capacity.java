package com.rays.string;

public class Capacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Abeet");
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());

		System.out.println("Append = " + sb.append(" Patel"));
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());
		
		System.out.println("Append = " + sb.append("     Patel"));
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());

		System.out.println("Append = " + sb.append(" Jabalpur Madhya Pradesh"));
		System.out.println("Length = " + sb.length());
		System.out.println("Capacity = " + sb.capacity());
	}
}
