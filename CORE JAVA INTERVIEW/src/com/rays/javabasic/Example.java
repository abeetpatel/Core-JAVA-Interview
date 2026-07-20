package com.rays.javabasic;

public class Example {

	public static void display() {
		System.out.println("Object created using Class.forName() and newInstance()");
	}

	public static void main(String[] args) {

		try {
			Class<?> clazz = Class.forName("com.rays.javabasic.Example");
			Example ex = (Example) clazz.getDeclaredConstructor().newInstance();
			ex.display();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
