package com.SuperKeyword;

public class Child extends Parent {
	// instance block
	public Child() {
		super(56);// this call parent class constructor and this line should me first line of
					// constructor
		System.out.println(super.x);
	}

	private void m2() {
		super.m1();// call parent class m1 method

	}

	public static void main(String[] args) {
	      //new Child().m2();  i.e--another way to call method
		Child y = new Child();
		System.out.println(y);
		// System.out.println(super.x); i.e. super keyword is not use in static context.

	}
}
