package com.AbstractionSituationProgram;

abstract class Shap {
	double dim1, dim2;

	// constructor
	public Shap(double a, double b) {
		dim1 = a;
		dim2 = b;
	}
// constructor
	public Shap(double a) {
		dim1 = a;
	}

	// abstract method
	abstract void area();

}
