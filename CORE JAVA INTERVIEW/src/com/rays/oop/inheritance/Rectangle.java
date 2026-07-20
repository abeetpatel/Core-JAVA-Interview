package com.rays.oop.inheritance;

public class Rectangle extends Shape {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void area() {

		int area = length * width;

		System.out.println("Rectangle Area => " + area);

	}

}
