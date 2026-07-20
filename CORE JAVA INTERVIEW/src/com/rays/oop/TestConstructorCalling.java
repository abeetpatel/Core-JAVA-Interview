package com.rays.oop;

public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fname, String lname) {
		super(fname, lname);
	}

	public static void main(String[] args) {
		TestConstructorCalling t = new TestConstructorCalling("Abeet", "Patel");
	}

}
