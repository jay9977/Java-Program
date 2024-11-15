package com.AbstractionProperty;

public class B extends A {

	@Override
	void m1() {

		System.out.println("Abstract method m1 of class A override in B");
	}

	@Override
	void m2() {
		System.out.println("Abstract method m2 of class A override in B");

	}

	@Override
	void m3() {
		System.out.println("Abstract method m3 of class A override in B");

	}

	@Override
	public void m4() {
		System.out.println("overrid unabstact metho of class A in class B");
	}
	
	public static void main(String[] args) {
		 B n = new B();
		n.m1();
		n.m2();
		n.m3();
		n.m4();

	}

}
