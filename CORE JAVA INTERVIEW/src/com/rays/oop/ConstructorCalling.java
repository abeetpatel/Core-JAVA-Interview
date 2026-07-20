package com.rays.oop;

public class ConstructorCalling {

	private String fname;
	private String lname;

	public ConstructorCalling() {

		System.out.println("Default Constructor");

	}

	public ConstructorCalling(String fname) {

		this();
		this.fname = fname;
		System.out.println(fname);

	}

	public ConstructorCalling(String fname, String lname) {

		this(fname);
		this.lname = lname;
		System.out.println(lname);

	}

}
