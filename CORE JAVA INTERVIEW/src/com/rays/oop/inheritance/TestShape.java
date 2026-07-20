package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Shape();

		s.area();

		Rectangle r = new Rectangle();

		r.area();

		Shape shape = new Rectangle();
		
		Rectangle rectangle = (Rectangle) shape;
		
		shape.setBorderWidth("five");
		shape.setColour("red");
		rectangle.setLength(5);
		rectangle.setWidth(5);
		
		rectangle.area();

		shape.area();
		
		
	}

}
