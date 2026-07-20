package com.rays.oop;

public class TestAbsClass extends AbstractClass{

	@Override
	public void show() {

		System.out.println("show method");
		
	}
	
	public TestAbsClass(String name) {
		super(name);
		System.out.println(name);
	}

	public static void main(String[] args) {	
		
		
		TestAbsClass t = new TestAbsClass("Abeet");

		t.simple();
		t.show();
		t.demo();
		
		AbstractClass.simple();
		
	}
	
}
