package com.rays.oop;

public abstract class AbstractClass {
	
	private String name;
	
	public AbstractClass() {
		
	}
	
	public AbstractClass(String name) {
		this.name = name;
	}
	
	public abstract void show();
	
	public static void simple() {
		System.out.println("hii");
	}
	
	public void demo() {
		System.out.println("hello");
	}
	
	// no default methods in abstract class

}
