package com.rays.javabasic;

import java.lang.reflect.Constructor;

public class ObjectCreateUsingReflection {

	public static void display() {

		System.out.println("Object created using reflection");

	}

	public static void main(String[] args) {

		try {

			Constructor<ObjectCreateUsingReflection> constructor = ObjectCreateUsingReflection.class
					.getDeclaredConstructor();
			ObjectCreateUsingReflection ex = constructor.newInstance();
			ex.display();

		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
