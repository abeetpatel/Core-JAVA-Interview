package com.rays.oop.methodreturn;

public class Triangle extends Shape {

	private double base;
	private double hight;

	public Triangle(double base, double hight) {
		this.base = base;
		this.hight = hight;
	}

	public double area() {
		double tArea = (base * hight) / 2;
		System.out.println("Area of Triangle =>" + tArea);
		return tArea;
	}

}
