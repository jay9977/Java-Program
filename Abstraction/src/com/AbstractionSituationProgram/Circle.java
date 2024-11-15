package com.AbstractionSituationProgram;

public class Circle extends Shap {
	// constructor
	Circle(double a) {
		super(a);
	}

// method
	@Override
	void area() {
		System.out.println("area of circle=" + (3.14 * dim1 * dim1));
	}

	public static void main(String[] args) {
		Shap s = new Rectangle(10, 20);
		s.area();
		Shap b = new Tringle(20, 10);
		b.area();
		Shap c = new Circle(40);
		c.area();

	}
}
