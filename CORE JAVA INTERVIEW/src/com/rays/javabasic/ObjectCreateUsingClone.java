package com.rays.javabasic;

public class ObjectCreateUsingClone implements Cloneable {

	public static void display() {

		System.out.println("Object is created using clone.");

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

	public static void main(String[] args) {
		try {
			ObjectCreateUsingClone original = new ObjectCreateUsingClone();
			ObjectCreateUsingClone clone = (ObjectCreateUsingClone) original.clone();
			clone.display();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();

		}

	}

}
