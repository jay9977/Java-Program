package com.AbstractionSituationProgram;

public class Tringle extends Shap {
	// constructor
	public Tringle(double a, double b) {
		super(a, b);
	}

//method
	@Override
	void area() {
		System.out.println("area of tringle=" + (0.5 * dim1 * dim2));

	}
}
