package com.AbstractionSituationProgram;

public class Rectangle extends Shap {
	// constructoor
	Rectangle(double a, double b) {
		super(a, b);
	}

	// method
	@Override
	void area() {
		System.out.println("area of rectangle=" + (dim1 * dim2));

	}

}
