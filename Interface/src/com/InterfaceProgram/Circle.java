package com.InterfaceProgram;

public class Circle extends Shape implements Inter {
	// Constructor for Circle, calling the Shape constructor
	public Circle(double a) {
		super(a);
	}

	@Override
	public void area() {
		System.out.println("Area of circle = " + (3.14 * dim1 * dim1));
	}
}
