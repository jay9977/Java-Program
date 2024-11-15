package com.InterfaceProgram;

public class Triangle extends Shape implements Inter {

	public Triangle(double a, double b) {
		super(a, b);
	}

	@Override
	public void area() {
		System.out.println("area of tringle=" + (0.5 * dim1 * dim2));

	}

}
