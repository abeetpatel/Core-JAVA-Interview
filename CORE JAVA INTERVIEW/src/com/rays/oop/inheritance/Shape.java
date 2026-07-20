package com.rays.oop.inheritance;

public class Shape {

	private String colour;
	private String borderWidth;

	public void setColour(String colour) {

		this.colour = colour;

	}

	public String getColour() {

		return colour;

	}

	public void setBorderWidth(String borderWidth) {

		this.borderWidth = borderWidth;

	}

	public String getBorderWidth() {

		return borderWidth;

	}

	public void area() {

		System.out.println("Shape Area");

	}

}
